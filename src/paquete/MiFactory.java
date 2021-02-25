package paquete;

public class MiFactory {

    private static <T> Sorter<T> createSorter(){

        Sorter<T> sorter = null;

        sorter = getSorter();

        return sorter;
    }

    public static <T> Sorter<T> getSorter(){

        PropertyUtils util = new PropertyUtils();
        String sorter = null;

        try {

            sorter = util.parseSorterFromProperties("MiFactory.properties");

            if(sorter != null){
                return (Sorter<T>) getInstance(sorter);
            }else{
                throw new NullPointerException("no se pudo instanciar el objeto");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static Object getInstance(String s) throws Exception {
        return Class.forName(s).newInstance();
    }

}
