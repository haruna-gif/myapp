def build() {
  echo "This is Building ..."
}

def test() {
  echo "This is testing state..."
}

def deploy() {
  echo "This is deploying ${params.VERSION} "
}

def docker() {
  echo "I think docker is ready to go..."
}

return this
