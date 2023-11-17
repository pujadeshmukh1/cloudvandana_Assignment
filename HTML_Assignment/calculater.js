// Get the display element
const displayElement = document.querySelector(".disp");

// Function to append values to the display
function appendToDisplay(value) {
  if (displayElement.textContent === "0") {
    displayElement.textContent = ""; // Remove the initial 0
  }
  displayElement.textContent += value;
  // displayElement.style.marginLeft = '15px';
}

// Function to clear the display
function clearDisplay() {
  displayElement.textContent = "0";
}

// Function to evaluate and display the result
function calculateResult() {
  try {
    const expression = displayElement.textContent;
    const result = eval(expression);
    clearDisplay();
    appendToDisplay(`${expression} = ${result}`);
  } catch (error) {
    clearDisplay();
    appendToDisplay("Error");
  }
}
