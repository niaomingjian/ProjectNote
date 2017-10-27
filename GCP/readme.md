### 使用gcloud工具连接GCP上的实例
+ 1. 初期化一下本地的配置  
 => gcloud init  
+ 2. 连接实例 docker  
 => gcloud compute ssh docker  
 需要再选择一下实例docker所在的zone  

### 命令
+ gcloud compute instances list => 显示所有可用的实例  

### Refs
+ [connecting-to-instance](https://cloud.google.com/compute/docs/instances/connecting-to-instance#sshingcloud)

### 我的结算帐号
https://console.cloud.google.com/billing/00D491-66E103-6F4A75?project=gcp20170324

### running angular on GCP
ng serve --host 0.0.0.0 --port 8080 --public publicipaddress  --disable-host-check
