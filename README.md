**Enum game**

You are in a game development team where the goal is to create a game that can be easily expanded. The team decides to change the values ​​of characters in the game using enums.

There is a basic character class, where the basic settings are as follows:
- name = name?
- healthPoint = 50
- damage = 30
- speed = 20
- armor = 0
- type = type?

When instantiating, the default values ​​are changed based on the type.

You need to create modifier values ​​for the following characters:

ORC:
- +10 damage
- -5 speed
- +10 health points
- +5 armor

KNIGHT:
- +5 damage
- +20 speed
- -5 health points
- +20 armor

WIZARD
- -5 damage
- +0 speed
- +5 health points
- +0 armor

ASSASSIN:
- +15 damage
- +10 speed
- -5 health points
- +0 armor

... and there is a mysterious character who gets a random type on each instantiation.
You can test in the Game main class with a while loop for example...

These enum modifiers cannot be changed externally.
