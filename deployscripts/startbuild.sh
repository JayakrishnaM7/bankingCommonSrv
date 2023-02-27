oc create -f pipeline.yaml
oc create -f triggerevents.yaml
tkn pipeline start garage-asset-pipeline -w name=shared-workspace,claimName=source-pvc -p deployment-name=bankingcommonsrv -p  git-url=https://github.com/bankasset/bankasset-bankingCommonSrv.git  -p IMAGE=image-registry.openshift-image-registry.svc:5000/garage-assets/bankingcommonsrv -p git-revision=master  -p helm-git-revision=main  -p sourcerepo=src -p targetrepo=helmrepo -p git-helm-url=https://github.com/rameshpoomalai/mcmrepo.git
