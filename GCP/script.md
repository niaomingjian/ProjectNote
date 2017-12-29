**`$ gcloud auth login`**
```
You are running on a Google Compute Engine virtual machine.
It is recommended that you use service accounts for authentication.

You can run:

  $ gcloud config set account `ACCOUNT`

to switch accounts if necessary.

Your credentials may be visible to others with access to this
virtual machine. Are you sure you want to authenticate with
your personal account?

Do you want to continue (Y/n)?  y

Go to the following link in your browser:

    https://accounts.google.com/o/oauth2/auth?redirect_uri=urn%3Aietf%3Awg%3Aoau
    ......

Enter verification code:
```
**`$ gcloud compute instances list`**
```
NAME        ZONE           MACHINE_TYPE   PREEMPTIBLE  INTERNAL_IP  EXTERNAL_IP      STATUS
standalone  us-central1-c  n1-standard-1               10.128.0.7                    TERMINATED
storm       us-central1-c  n1-standard-1               10.128.0.4   104.154.200.243  RUNNING
storm2      us-central1-c  n1-standard-1               10.128.0.5                    TERMINATED
storm3      us-central1-c  n1-standard-1               10.128.0.6                    TERMINATED
```
