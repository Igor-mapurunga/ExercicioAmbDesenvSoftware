function Primo(n) {
  if (n < 2) {
    return false;
  }
  for (let i = 2; i * i <= n; i++) {
    if (n % i === 0) {
      return console.log("O numero: " + n + " não é primo");
    }
  }
  return console.log("O numero " + n + " é primo");
}

console.log(Primo(2))
console.log(Primo(3))
console.log(Primo(5))
console.log(Primo(9))
