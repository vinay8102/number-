const randomNumber = Math.floor(Math.random() * 100) + 1;
let attempts = 0;

function checkGuess() {
    const guess = parseInt(document.getElementById('guess').value);
    attempts++;

    if (guess === randomNumber) {
        setMessage(`Congratulations! You've guessed the correct number (${randomNumber}) in ${attempts} attempts.`);
        alert('Congratulations');
    } else if (guess < randomNumber) {
        setMessage('Too low! Try again.');
        alert('Too low! Try again')
    } else {
        setMessage('Too high! Try again.');
        alert('Too high! Try again')
    }
}

function setMessage(message) {
    document.getElementById('message').textContent = message;
}
