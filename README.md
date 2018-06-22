This project is a maven based java project for exposing Spring Boot based REST services using swagger and ODATA2 using Olingo framework.
Annotation based Olingo processor as well as JPA based processor has been implemented


In order to implement a custom data source
eg. In the annotations sample, they have shown how to use InMemory data source as follows

public class AnnotationSampleServiceFactory extends ODataServiceFactory
public class AnnotationServiceFactoryImpl implements AnnotationServiceFactoryInstance
  @Override
  public ODataService createAnnotationService(final Collection<Class<?>> annotatedClasses) throws ODataException {
    AnnotationEdmProvider edmProvider = new AnnotationEdmProvider(annotatedClasses);
    AnnotationInMemoryDs dataSource = new AnnotationInMemoryDs(annotatedClasses);
    AnnotationValueAccess valueAccess = new AnnotationValueAccess();

    // Edm via Annotations and ListProcessor via AnnotationDS with AnnotationsValueAccess
    return RuntimeDelegate.createODataSingleProcessorService(edmProvider,
        new ListsProcessor(dataSource, valueAccess));
  }

The key thing to note here is the AnnotationInMemoryDs
public class AnnotationInMemoryDs implements DataSource
with methods like

  List<?> readData(EdmEntitySet entitySet) throws ODataNotImplementedException, ODataNotFoundException, EdmException,

  Object readData(EdmEntitySet entitySet, Map<String, Object> keys) throws ODataNotImplementedException,
      ODataNotFoundException, EdmException, ODataApplicationException;

  Object readData(EdmFunctionImport function, Map<String, Object> parameters, Map<String, Object> keys)
      throws ODataNotImplementedException, ODataNotFoundException, EdmException, ODataApplicationException;

  Object readRelatedData(EdmEntitySet sourceEntitySet, Object sourceData, EdmEntitySet targetEntitySet,
      Map<String, Object> targetKeys) throws ODataNotImplementedException, ODataNotFoundException, EdmException,
      ODataApplicationException;

   BinaryData readBinaryData(EdmEntitySet entitySet, Object mediaLinkEntryData) throws ODataNotImplementedException,
      ODataNotFoundException, EdmException, ODataApplicationException;

  Object newDataObject(EdmEntitySet entitySet) throws ODataNotImplementedException, EdmException,
      ODataApplicationException;

  void writeBinaryData(EdmEntitySet entitySet, Object mediaLinkEntryData, BinaryData binaryData)
      throws ODataNotImplementedException, ODataNotFoundException, EdmException, ODataApplicationException;

  void deleteData(EdmEntitySet entitySet, Map<String, Object> keys) throws ODataNotImplementedException,
      ODataNotFoundException, EdmException, ODataApplicationException;

  void createData(EdmEntitySet entitySet, Object data) throws ODataNotImplementedException, EdmException,
      ODataApplicationException;

  void deleteRelation(EdmEntitySet sourceEntitySet, Object sourceData, EdmEntitySet targetEntitySet,
      Map<String, Object> targetKeys) throws ODataNotImplementedException, ODataNotFoundException, EdmException,
      ODataApplicationException;

  void writeRelation(EdmEntitySet sourceEntitySet, Object sourceData, EdmEntitySet targetEntitySet,
      Map<String, Object> targetKeys) throws ODataNotImplementedException, ODataNotFoundException, EdmException,
      ODataApplicationException;




If you have requirement to implement, say a custom data source, that itself acts a client to another odata service
(I had such a requirement!)
You will need to write class MyCustomDSWhicActsAsODataClient implements DataSource
