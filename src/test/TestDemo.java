import com.lucene.demo.IndexManager;
import org.junit.Test;

import java.io.File;

/**
 * Created by wangc on 2017/3/23.
 */
public class TestDemo {

    @Test
    public void test(){
        File fileIndex = new File(IndexManager.INDEX_DIR);
        if(IndexManager.deleteDir(fileIndex)){
            fileIndex.mkdir();
        }else{
            fileIndex.mkdir();
        }

        IndexManager.createIndex(IndexManager.DATA_DIR);
        IndexManager.searchIndex("内存分区");
    }
}
