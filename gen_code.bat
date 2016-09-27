set echo=ON

set gen_ver=r7_0
set full_ver=7.0.0.1105

rd src\main\java /s /q
md src\main\java

xjc -p com.solacesystems.semp_jaxb.%gen_ver%.request -d src\main\java xsd\semp-rpc-soltr-%full_ver%.xsd           -b xsd\semp-rpc-soltr-%full_ver%-jaxb-bindings.xsd

xjc -p com.solacesystems.semp_jaxb.%gen_ver%.reply      -d src\main\java xsd\semp-rpc-reply-soltr-%full_ver%.xsd -b xsd\semp-rpc-reply-soltr-%full_ver%-jaxb-bindings.xsd