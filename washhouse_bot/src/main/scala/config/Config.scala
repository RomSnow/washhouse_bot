package config

case class Config(
                  database: DatabaseConfig
                 )

case class DatabaseConfig(
                          dbHost: String,
                          dbPort: String,
                          dbLogin: String,
                          dbPassword: String
                         )
