import cats.effect.{IO, IOApp}
import config.ConfigReaderIO

object Main extends IOApp.Simple {
  override def run: IO[Unit] = {
    for {
      config <- ConfigReaderIO.getConfig
      _ <- IO.print(config.database.dbHost)
    } yield ()
  }
}
