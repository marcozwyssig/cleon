@ECHO OFF
SET var=file:/%cd%
ECHO Repository: %var%

eclipsec -application -nosplash org.eclipse.equinox.p2.publisher.UpdateSitePublisher -metadataRepository %var% -artifactRepository %var% -source ./ --compress publishArtifacts