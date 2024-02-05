import org.apache.hadoop.fs.FileSystem;
public class FunctionUse2038 {
public void funcUse() {
FileSystem filesystem = new FileSystem();
filesystem.removeDefaultAcl(null);
}
}