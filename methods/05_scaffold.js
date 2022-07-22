// Scaffold -- Provide students with vocabulary and skeleton to have them practice printing the length and first characters of strings. 

// Students instructions (Provided for Students)
// The characters in a string each have an index.

// string.length returns the length of a string
// string.substring(start,end) returns a portion of the string, beginning at the start index and ending with the letter before the end index.

// Do This
// Run the code to see how these two new commands work
// Follow the pattern in the starter code to print the name, length, and first character of the longest country and city name in the console.


var longestAnimal = "Parastratiosphecomyia sphecomyioides";
var longestCountry = "The United Kingdom of Great Britain and Northern Ireland"
var longestCity = "Krung Thep Mahanakhon Amon Rattanakosin Mahinthara Yuthaya Mahadilok Phop Noppharat Ratchathani Burirom Udomratchaniwet Mahasathan Amon Piman Awatan Sathit Sakkathattiya Witsanukam Prasit"

console.log("The longest animal name is " + longestAnimal);
console.log("It has " + longestAnimal.length + " characters");
console.log("Its first letter is " + longestAnimal.substring(0,1));

// Print the name, length, and first letter of the longestCountry
console.log("The longest Country name is " + longestCountry);
console.log("It has " + longestCountry.length + " characters");
console.log("Its first letter is " + longestCountry.substring(0,1));



// Print the name, length, and first letter of the longestCity