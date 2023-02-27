ARG IMAGE=rameshpoomalai/libertyspringbootjava11
FROM ${IMAGE} as staging

COPY --chown=1001:0 ./bankingcommonsrv/target/bankingcommonsrv-2.4.3.jar /staging/bankingcommonsrvapptemp.jar
COPY ./es-cert.p12 /staging/es-cert.p12


RUN springBootUtility thin \
 --sourceAppPath=/staging/bankingcommonsrvapptemp.jar \
 --targetThinAppPath=/staging/bankingcommonsrvapp-final.jar \
 --targetLibCachePath=/staging/lib.index.cache

FROM ${IMAGE}

COPY --from=staging /staging/lib.index.cache /lib.index.cache
COPY --from=staging /staging/bankingcommonsrvapp-final.jar /config/dropins/spring/bankingcommonsrvappfinal.jar

COPY --from=staging /staging/es-cert.p12 /config/es-cert.p12
EXPOSE 9080
