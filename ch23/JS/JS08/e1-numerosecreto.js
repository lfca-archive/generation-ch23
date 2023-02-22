class GuessingGame {
    constructor(secretNumber) {
      this.secretNumber = secretNumber;
      this.guesses = [];
    }
  
    guess(number) {
      if (number === this.secretNumber) {
        const message = `Felicidades, adivinaste el número secreto. Números introducidos: ${this.guesses.join(", ")}`;
        document.getElementById("guess-result").textContent = message;
      } else {
        const hint = number < this.secretNumber ? "El número secreto es mayor" : "El número secreto es menor";
        const message = `Ups, el número secreto es incorrecto. ${hint}, vuelve a intentarlo.`;
        document.getElementById("guess-result").textContent = message;
        this.guesses.push(number);
      }
    }
  }
  
  const game = new GuessingGame(17);
  
  document.getElementById("guess-button").addEventListener("click", () => {
    const guessInput = document.getElementById("guess-input");
    const guess = Number(guessInput.value);
    if (isNaN(guess) || guess < 1 || guess > 100) {
      alert("Introduce un número válido (entre 1 y 100).");
      return;
    }
    game.guess(guess);
    guessInput.value = "";
  });
  