import java.util.logging.Logger
import org.apache.spark.{SparkConf, SparkContext}

object sparkEnvironment {
  Logger.getLogger("org.apache.spark").setLevel(Level.WARN)
  Logger.getLogger("org.eclipse.jetty.server").setLevel(Level.OFF)
  
  val conf = new SparkConf().setAppName("Netflix")
  val sc = new SparkContext(conf)
  
}