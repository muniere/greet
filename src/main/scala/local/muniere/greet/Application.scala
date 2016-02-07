package local.muniere.greet

import scopt.OptionParser


object Application {

  /**
    * CLI parser
    */
  val parser = new OptionParser[Context]("greeter") {
    this.opt[Int]('c', "count").optional()
      .valueName("<number>")
      .action { (value: Int, context: Context) =>
        context.copy(count = value)
      }
      .text("How many times to greet")

    this.arg[String]("message")
      .action { (value: String, context: Context) =>
        context.copy(message = value)
      }
      .text("Message to greet")

    this.help("help")
      .text("Show this help message")
  }

  /**
    * Run application
    *
    * @param args CLI arguments
    */
  def main(args: Array[String]) = {

    val context = try {
      this.parse(args)
    } catch {
      case _: Throwable => Context.default
    }

    if (context.message == null) {
      this.parser.showUsageAsError
      System.exit(0)
    }

    (1 to context.count).foreach { _ =>
      Console.println(context.message)
    }
  }

  /**
    * Parse arguments
    *
    * @param args CLI arguments
    * @return Parsed context
    */
  def parse(args: Array[String]): Context = {
    this.parser.parse(args, init = Context.default).get
  }
}
