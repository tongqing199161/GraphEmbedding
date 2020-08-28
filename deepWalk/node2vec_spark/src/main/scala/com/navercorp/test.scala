package node2vec_spark.src.main.scala.com.navercorp

import org.dmg.pmml.True
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper

object test {
  def main(args: Array[String]): Unit = {
    var neighbors: Array[(Long, Double)] = Array.empty[(Long, Double)]
    var blear:Boolean= true

    blear match {
      case true => println("heelo")
      case false => println("hlo")
    }
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")
    val J =Array(1,3,4,5)
    val K1=Array.fill(20-J.length)(0)

    Array.concat(J,K1).foreach(println)


  }
}
