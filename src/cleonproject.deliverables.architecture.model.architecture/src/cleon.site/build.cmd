@ECHO OFF
SET var=file:/%cd%/site
ECHO Repository: %var%

eclipse -application -nosplash org.eclipse.equinox.p2.publisher.UpdateSitePublisher -metadataRepository %var% -artifactRepository %var% -source ./ -publishArtifacts