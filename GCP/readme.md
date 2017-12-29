### 使用gcloud工具连接GCP上的实例
+ 1. 初期化一下本地的配置  
 => gcloud init  
+ 2. 连接实例 docker  
 => gcloud compute ssh docker  
 需要再选择一下实例docker所在的zone  
+ 3. 切换账户  
 `$ gcloud config set account <ACCOUNT>`
+ 4. 切换项目  
 `gcloud config set project PROJECT_ID`

### 命令
+ gcloud compute instances list => 显示所有可用的实例  

### Refs
+ [connecting-to-instance](https://cloud.google.com/compute/docs/instances/connecting-to-instance#sshingcloud)
+ [Adding a persistent disk to your instance](https://cloud.google.com/compute/docs/disks/add-persistent-disk#create_disk)
  + Formatting and mounting a non-boot persistent disk  
    最简单的是create a single ext4 file system without a partition table，好处是makes it simple to resize your disk later  
    `sudo lsblk` => list the disks  
      + mkfs tool => format the disk  
      `-E` flag => maximize disk performance  
      `-m 0` => use all of the available disk space  
      `sudo mkfs.ext4 -m 0 -F -E lazy_itable_init=0,lazy_journal_init=0,discard /dev/[DEVICE_ID]`  
      + Create a directory that serves as the mount point for the new disk  
      `sudo mkdir -p /mnt/disks/[MNT_DIR]`  
      + mount tool => mount the disk  
      `sudo mount -o discard,defaults /dev/[DEVICE_ID] /mnt/disks/[MNT_DIR]`
      + Configure read and write permissions on the device. For this example, grant write access to the device for all users.  
      `sudo chmod a+w /mnt/disks/[MNT_DIR]`  
  + add the persistent disk to the `/etc/fstab` file so that the device automatically mounts again when the instance restarts
    `blkid` command => find the UUID for the persistent disk  
    `sudo blkid /dev/[DEVICE_ID]`  
    Add the following code to `/etc/fstab` file  
    `UUID=[UUID_VALUE] /mnt/disks/[MNT_DIR] ext4 discard,defaults,[NOFAIL] 0 2`  
    


### 我的结算帐号
https://console.cloud.google.com/billing/00D491-66E103-6F4A75?project=gcp20170324

### running angular on GCP
ng serve --host 0.0.0.0 --port 8080 --public publicipaddress  --disable-host-check


### Installation
+ Install git  
  [How To Install Git on CentOS 7](https://www.digitalocean.com/community/tutorials/how-to-install-git-on-centos-7)  
  `sudo yum install git`
+ [How to Install Pip on CentOS 7](https://www.liquidweb.com/kb/how-to-install-pip-on-centos-7/)  

### Questions
+ 如何调整GCE的系统时间？
