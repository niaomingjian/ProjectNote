
## Links ##

## Notes ##

**org.springframework.data.elasticsearch.core**  
+ ElasticsearchTemplate  

```
	private Client client;
	private ResultsMapper resultsMapper;
  
	@Override
	public <T> AggregatedPage<T> queryForPage(SearchQuery query, Class<T> clazz, SearchResultMapper mapper) {
		SearchResponse response = doSearch(prepareSearch(query, clazz), query);
		return mapper.mapResults(response, clazz, query.getPageable());
	}
  
	private SearchResponse doSearch(SearchRequestBuilder searchRequest, SearchQuery searchQuery) {
		if (searchQuery.getFilter() != null) {
			searchRequest.setPostFilter(searchQuery.getFilter());
		}

		if (!isEmpty(searchQuery.getElasticsearchSorts())) {
			for (SortBuilder sort : searchQuery.getElasticsearchSorts()) {
				searchRequest.addSort(sort);
			}
		}

		if (!searchQuery.getScriptFields().isEmpty()) {
			searchRequest.addField("_source");
			for (ScriptField scriptedField : searchQuery.getScriptFields()) {
				searchRequest.addScriptField(scriptedField.fieldName(), scriptedField.script());
			}
		}

		if (searchQuery.getHighlightFields() != null) {
			for (HighlightBuilder.Field highlightField : searchQuery.getHighlightFields()) {
				searchRequest.addHighlightedField(highlightField);
			}
		}

		if (!isEmpty(searchQuery.getIndicesBoost())) {
			for (IndexBoost indexBoost : searchQuery.getIndicesBoost()) {
				searchRequest.addIndexBoost(indexBoost.getIndexName(), indexBoost.getBoost());
			}
		}

		if (!isEmpty(searchQuery.getAggregations())) {
			for (AbstractAggregationBuilder aggregationBuilder : searchQuery.getAggregations()) {
				searchRequest.addAggregation(aggregationBuilder);
			}
		}

		if (!isEmpty(searchQuery.getFacets())) {
			for (FacetRequest aggregatedFacet : searchQuery.getFacets()) {
				searchRequest.addAggregation(aggregatedFacet.getFacet());
			}
		}
		return getSearchResponse(searchRequest.setQuery(searchQuery.getQuery()).execute());
	}
  
	private <T> SearchRequestBuilder prepareSearch(Query query, Class<T> clazz) {
		setPersistentEntityIndexAndType(query, clazz);
		return prepareSearch(query);
	}
  
	private SearchRequestBuilder prepareSearch(Query query) {
		Assert.notNull(query.getIndices(), "No index defined for Query");
		Assert.notNull(query.getTypes(), "No type defined for Query");

		int startRecord = 0;
		SearchRequestBuilder searchRequestBuilder = client.prepareSearch(toArray(query.getIndices()))
				.setSearchType(query.getSearchType()).setTypes(toArray(query.getTypes()));

		if (query.getSourceFilter() != null) {
			SourceFilter sourceFilter = query.getSourceFilter();
			searchRequestBuilder.setFetchSource(sourceFilter.getIncludes(), sourceFilter.getExcludes());
		}

		if (query.getPageable() != null) {
			startRecord = query.getPageable().getPageNumber() * query.getPageable().getPageSize();
			searchRequestBuilder.setSize(query.getPageable().getPageSize());
		}
		searchRequestBuilder.setFrom(startRecord);

		if (!query.getFields().isEmpty()) {
			searchRequestBuilder.addFields(toArray(query.getFields()));
		}

		if (query.getSort() != null) {
			for (Sort.Order order : query.getSort()) {
				searchRequestBuilder.addSort(order.getProperty(), order.getDirection() == Sort.Direction.DESC ? SortOrder.DESC
						: SortOrder.ASC);
			}
		}

		if (query.getMinScore() > 0) {
			searchRequestBuilder.setMinScore(query.getMinScore());
		}
		return searchRequestBuilder;
	}
  
  
```
  
+ DefaultEntityMapper  
+ DefaultResultMapper  

DefaultResultMapper => AbstractResultMapper => ResultsMapper => SearchResultMapper, GetResultMapper, MultiGetResultMapper  
DefaultEntityMapper => EntityMapper
