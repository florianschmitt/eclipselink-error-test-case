# eclipselink-error-test-case

# gradlew test

```
Caused by: org.eclipse.persistence.exceptions.EntityManagerSetupException: 
Exception Description: Predeployment of PersistenceUnit [PU1] failed.
Internal Exception: Exception [EclipseLink-7161] (Eclipse Persistence Services - 2.6.1.v20150916-55dc7c3): org.eclipse.persistence.exceptions.ValidationException
Exception Description: Entity class [class com.explicatis.datamodel.Entity1] has no primary key specified. It should define either an @Id, @EmbeddedId or an @IdClass. If you have defined PK using any of these annotations then make sure that you do not have mixed access-type (both fields and properties annotated) in your entity class hierarchy.
	at org.eclipse.persistence.exceptions.EntityManagerSetupException.predeployFailed(EntityManagerSetupException.java:231) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	... 25 common frames omitted
Caused by: org.eclipse.persistence.exceptions.ValidationException: 
Exception Description: Entity class [class com.explicatis.datamodel.Entity1] has no primary key specified. It should define either an @Id, @EmbeddedId or an @IdClass. If you have defined PK using any of these annotations then make sure that you do not have mixed access-type (both fields and properties annotated) in your entity class hierarchy.
	at org.eclipse.persistence.exceptions.ValidationException.noPrimaryKeyAnnotationsFound(ValidationException.java:1425) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	at org.eclipse.persistence.internal.jpa.metadata.accessors.classes.EntityAccessor.validatePrimaryKey(EntityAccessor.java:1542) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	at org.eclipse.persistence.internal.jpa.metadata.accessors.classes.EntityAccessor.processMappingAccessors(EntityAccessor.java:1249) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	at org.eclipse.persistence.internal.jpa.metadata.accessors.classes.EntityAccessor.process(EntityAccessor.java:699) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	at org.eclipse.persistence.internal.jpa.metadata.MetadataProject.processStage2(MetadataProject.java:1808) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	at org.eclipse.persistence.internal.jpa.metadata.MetadataProcessor.processORMMetadata(MetadataProcessor.java:573) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	at org.eclipse.persistence.internal.jpa.deployment.PersistenceUnitProcessor.processORMetadata(PersistenceUnitProcessor.java:604) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	at org.eclipse.persistence.internal.jpa.EntityManagerSetupImpl.predeploy(EntityManagerSetupImpl.java:1948) ~[eclipselink-2.6.1.jar:2.6.1.v20150916-55dc7c3]
	... 23 common frames omitted
	```
