package config

import cats.effect.IO
import pureconfig._
import pureconfig.generic.auto._

object ConfigReaderIO {

  def getConfig: IO[Config] =
    IO.fromEither(ConfigSource.default.load[Config].left.map(f => new Throwable(f.prettyPrint())))

}