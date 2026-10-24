def build() {
  echo "This is Building the app ..."
}

def test() {
  echo "This is testing state..."
  echo "I wanna know where to ${params.ENV}."
}

def deploy() {
  echo "This is deploying ${params.VERSION} "
}

def docker() {
  echo "I think docker is ready to go..."
}

return this
