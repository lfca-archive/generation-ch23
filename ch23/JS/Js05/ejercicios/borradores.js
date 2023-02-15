  /************** Exercise  #1  ***************/
/*https://github.com/generation-org/JS/tree/master/JS-05%20-%20Operators%20and%20Expressions
  /* Exercise #1
You have a list of names: var names = ["Maria", "Antony", "Joy", "Juan"]

Part 1
Write a function to insert a name to the end of the list. Add your own name to the end of the list.
*/
let names= ["Maria", "Antony", "Joy", "Juan"];

// Part 1
const addNameToList = ("Luisa"); 
names.push("luisa");


// Part 2
const checkNameInList = ("Luisa");
names.includes("Luisa");

// Part 3
const compareLists = (list);
names.filter(name => list.includes(name));

// Part 4
const getLengthOfNames = (names) => names.map(name => name.length);

// Test the functions
console.log(names);
console.log(checkNameInList("Joy"));
console.log(compareLists(["Maria", "Antony"]));
console.log(getLengthOfNames(names));






    // Part 1  
    //Write a function to insert a name to the end of the list. Add your own name to the end of the list.
       // In Part 1, we define a function addNameToList that takes a name and a list as arguments and appends the name to the end of the list using the push method.
  
  /*var names = ["Maria", "Antony", "Joy", "Juan"];
  addNameToList("Luisa");
  
  // Part 2
        //In Part 2, we define a function hasName that takes a name and a list as arguments and returns a boolean indicating whether the list contains the name using the includes method.

  /*function hasName(name, list) {
    return names.includes("Luisa");
  }
  
  console.log(hasName("Luisa", names)); // true
  console.log(hasName("Mario", names)); // false
  
  // Part 3 
        //In Part 3, we define a function commonNames that takes two lists as arguments and returns a list of names that are present in both lists by iterating through the first list and checking whether each name is in the second list using the includes method.
  
function commonNames(list1, list2) {
    var common = [];
    for (var i = 0; i < list1.length; i++) {
      if (list2.includes(list1[i])) {
        common.push(list1[i]);
      }
    }
    return common;
  }
  
  var otherNames = ["Joy", "Sarah", "Derek"];
  console.log(commonNames(names, otherNames)); // ["Joy"]
  
  // Part 4
        //In Part 4, we define a function nameLengths that takes a list of names as an argument and returns a list of the lengths of those names in the same order using a for loop to iterate over the names and push to add each length to a new list.
  function nameLengths(list) {
    var lengths = [];
    for (var i = 0; i < list.length; i++) {
      lengths.push(list[i].length);
    }
    return lengths;
  }
  
  console.log(nameLengths(names)); // [5, 6, 3, 4, 4]
  

  /************** Exercise  #2  ***************/
  //What do the following expressions evaluate to?

false || (true && false);
true || (11 + 12);
(31 + 22) || true;
true && (1 + 7);
false && (3 + 4);
(1 + 2) && true;
(32 * 4) >= 129;
false !== !true;
true === 4;
false === (847 === '847');
false === (887 == '887');
(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false;

/*****
 *  false || (true && false) evaluates to false because the && operator has higher precedence than ||, so (true && false) evaluates to false, and then false || false evaluates to false.

true || (11 + 12) evaluates to true because the first operand is true, so the whole expression will always be true, regardless of the value of the second operand.

(31 + 22) || true evaluates to true because the first operand is truthy (53), so the whole expression will always be true, regardless of the value of the second operand.

true && (1 + 7) evaluates to 8 because both operands are truthy, so the && operator returns the value of the second operand, which is 8.

false && (3 + 4) evaluates to false because the first operand is falsy, so the whole expression will always be false, regardless of the value of the second operand.

(1 + 2) && true evaluates to true because both operands are truthy, so the && operator returns the value of the second operand, which is true.

(32 * 4) >= 129 evaluates to true because 32 * 4 is 128, which is equal to 129, so the comparison is true.

false !== !true evaluates to false because !true evaluates to false, so the expression is equivalent to false !== false, which is false.

true === 4 evaluates to false because the types of the two operands are different, so they cannot be equal.

false === (847 === '847') evaluates to true because the comparison 847 === '847' is false because the operands have different types ('847' is a string, while 847 is a number), so the expression is equivalent to false === false, which is true.

false === (887 == '887') evaluates to false because the comparison 887 == '887' is true because the == operator performs type coercion, converting the string to a number before comparing them, so the expression is equivalent to false === true, which is false.

(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false evaluates to true because at least one of the three sub-expressions is true:
!true is true because the ! operator negates the value of true, which is false.
(!(100 / 5) === 20) is false because 100 / 5 is 20, so the comparison is equivalent to !(20 === 20), which is false.
((328 / 4) === 82) is true because 328 / 4 is 82, so the comparison is true.
 */

  /************** Exercise  #3  ***************/

/***
 * Write a function that logs whether a number is between 0 and 25 (inclusive), between 26 and 100 (inclusive), greater than 100, or less than 0.

numberRange(25);   // '25 is between 0 and 25'
numberRange(75);   // '75 is between 26 and 100'
numberRange(125);  // '125 is greater than 100'
numberRange(-25);  // '-25 is less than 0'
 */

function numberRange(num) {
    if (num >= 0 && num <= 25) {
      console.log(num + ' is between 0 and 25');
    } else if (num >= 26 && num <= 100) {
      console.log(num + ' is between 26 and 100');
    } else if (num > 100) {
      console.log(num + ' is greater than 100');
    } else {
      console.log(num + ' is less than 0');
    }
  }
  /**
   * This function takes a number as an argument and logs a message indicating which range the number falls into. It uses a series of if/else if statements to check the value of the number against the different ranges, and logs the appropriate message depending on which range it falls into.
   */


  if (AcumulativeGPA > 2.0 && Totalunits >= 120) {
    console.log("You can graduate!");
  }


  if (notecsp >= 75 && noteprog >= 75) {
  console.log("You're eligible to graduate!");
}


let text = "Hello World";

// Split the string into an array of words
let words = text.split(" ");

// Map each word to an array of characters, join with periods in between, and join the characters back into a string
let result = words.map(word => word.split("").join("."));

// Join the words back together into a string with spaces in between
result = result.join(" ");

console.log(result); // Output: H.e.l.l.o W.o.r.l.d


let text = "Hello World";
let result = text.split(" ").map(word => word.split("").join(".")).join(" ");
console.log(result); // Output: H.e.l.l.o W.o.r.l.d
