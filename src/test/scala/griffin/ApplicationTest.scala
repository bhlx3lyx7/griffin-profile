package griffin

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfter, FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class ApplicationTest extends FunSuite with Matchers with BeforeAndAfter {

  val envFile = "src/test/resources/env.json"
  val confFile = "src/test/resources/config.json"

  val envFsType = "local"
  val confFsType = "local"
  val fsTypes = s"${envFile},${confFsType}"

  val args = Array(envFile, confFile, fsTypes)

  test ("main") {
    App.main(args)
  }

}
