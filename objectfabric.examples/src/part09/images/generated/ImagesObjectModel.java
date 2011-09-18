
package part09.images.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access" })
public class ImagesObjectModel extends com.objectfabric.ObjectModel {

    private static final byte[] UID = { -68, -86, -119, 98, -56, 13, 8, -42, 87, -30, -54, 4, 57, -62, 75, -9 };

    private static volatile ImagesObjectModel _instance;

    private static final Object _lock = new Object();

    protected ImagesObjectModel(com.objectfabric.TObject.Version shared) {
        super(shared);
    }

    protected ImagesObjectModel() {
        this(new Version(null));
    }

    public static ImagesObjectModel getInstance() {
        if (_instance == null) {
            synchronized (_lock) {
                if (_instance == null)
                    _instance = new ImagesObjectModel();
            }
        }

        return _instance;
    }

    public static byte[] getUID() {
        byte[] copy = new byte[UID.length];
        com.objectfabric.misc.PlatformAdapter.arraycopy(UID, 0, copy, 0, copy.length);
        return copy;
    }

    /**
     * Registers this object model so that its classes can be serialized by the
     * system.
     */
    public static void register() {
        register(getInstance());
    }

    /**
     * Registers an object model which can override <code>createInstance</code>
     * to let the system use your own derived classes. This is necessary e.g. to
     * implement remote methods on transactional objects.
     */
    public static void registerOverridenModel(ImagesObjectModel model) {
        synchronized (_lock) {
            if (_instance != null)
                throw new RuntimeException("Object model has already been registered. This method can only be called at program startup.");

            _instance = model;
        }

        register(model);
    }

    @Override
    protected java.lang.String getObjectFabricVersion() {
        return "0.8";
    }

    public static final int CLASS_COUNT = 1;

    public static final int PART09_IMAGES_GENERATED_IMAGEINFO_CLASS_ID = 0;

    public static final int METHOD_COUNT = 0;

    @Override
    protected java.lang.Class getClass(int classId, com.objectfabric.TType[] genericParameters) {
        switch (classId) {
            case PART09_IMAGES_GENERATED_IMAGEINFO_CLASS_ID:
                return part09.images.generated.ImageInfo.class;
        }

        return super.getClass(classId, genericParameters);
    }

    @Override
    protected com.objectfabric.TObject.UserTObject createInstance(com.objectfabric.Transaction trunk, int classId, com.objectfabric.TType[] genericParameters) {
        switch (classId) {
            case PART09_IMAGES_GENERATED_IMAGEINFO_CLASS_ID:
                return new part09.images.generated.ImageInfo(trunk);
        }

        return super.createInstance(trunk, classId, genericParameters);
    }

    protected static final class Version extends com.objectfabric.ObjectModel.Version {

        public Version(com.objectfabric.ObjectModel.Version shared) {
            super(shared);
        }

        @Override
        public byte[] getUID() {
            return ImagesObjectModel.UID;
        }
    }
}
