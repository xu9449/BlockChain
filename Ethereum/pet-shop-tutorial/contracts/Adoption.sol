pragma solidity ^0.4.2;
//pragma means additional information that only the compiler cares about
// ^ means the version indicated or highter
contract Adoption 
{
// Variable setup
// address are ethereum address
address[16] public adopters;
//public variables have automatic getter methods

//Adopting a pet 
function adopt(uint petId) public returns (uint) {
require(petId >= 0 && petId <= 15);
adopters[petId] = msg.sender;
return petId;
}
// In Solidity the types of both the function parameters and output must be specified
// arrays in Solidity are indexed from 0 

// Retrieving the adopters
function getAdopters() public view returns (address[16]) 
{
  return adopters;
}
}
