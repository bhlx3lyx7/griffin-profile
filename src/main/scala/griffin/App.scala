package griffin

import org.apache.griffin.measure.batch.log.Loggable
import org.apache.griffin.measure.batch.Application

object App extends Loggable {

  def main(args: Array[String]): Unit = {
    Application.main(args)
  }

}
