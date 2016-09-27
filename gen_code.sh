#!/bin/bash -x

gen_ver=r7_2VMR
full_ver=7.2.0.700

rm -rf src/main/java
mkdir -p src/main/java

xjc -p com.solacesystems.semp_jaxb.$gen_ver.request \
	-d src/main/java xsd/semp-rpc-soltr-$full_ver.xsd \
	-b xsd/semp-rpc-soltr-$full_ver-jaxb-bindings.xsd

xjc -p com.solacesystems.semp_jaxb.$gen_ver.reply \
	-d src/main/java xsd/semp-rpc-reply-soltr-$full_ver.xsd \
	-b xsd/semp-rpc-reply-soltr-$full_ver-jaxb-bindings.xsd
