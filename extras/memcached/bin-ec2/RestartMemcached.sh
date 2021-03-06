#! /bin/sh

# checking the number of argument. First argument should be the path of rsa key file
if [ $# -ne 1 ]
then
     echo  "args: [path of the rsa key file]"
     exit
fi
 
# if file does not exist then exit
if [ ! -f $1 ]
then
	echo "$1 does not exist"
	exit
fi

LIST_OF_IP_ADDRESSESS='ListOfIpAddressess.txt'

var=`cat "$LIST_OF_IP_ADDRESSESS"`
for i in $var; do
	ip_address=$i
	echo "Restarting memcached server on $ip_address ..."
	`ssh -i $1 root@"$ip_address" 'killall memcached'`
	`ssh -i $1 root@"$ip_address" './start_memcached.sh'`
done

