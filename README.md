# Greet

Greet messages

## Get started

```bash
# install
$ brew install muniere/triv/greet

# run
$ greet -c "Hello, world"
```

## Usage

```bash
# default
$ greet "Hello, world"

# many times
$ greet -c 10 "Hello, world"
```

## For Development

```bash
# clone
$ git clone https://github.com/muniere/greet.git
$ cd greet

# assemble
$ sbt clean assembly

# run
$ java -jar target/greet.jar "Hello, world"
```

## LICENSE

This software is released under the MIT License.
