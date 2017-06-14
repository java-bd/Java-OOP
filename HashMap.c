#include <assert.h>  //	Conditionally compiled macro that compares its argument to zero
#include <complex.h> // (since C99) 	Complex number arithmetic
#include <ctype.h>   //	Functions to determine the type contained in character data
#include <errno.h>   //	Macros reporting error conditions
#include <fenv.h>    // (since C99) 	Floating-point environment
#include <float.h> 	// Limits of float types
#include <inttypes.h>// (since C99) 	Format conversion of integer types
#include <iso646.h>  // (since C95) 	Alternative operator spellings
#include <limits.h>  //	Sizes of basic types
#include <locale.h>  //	Localization utilities
#include <math.h> 	// Common mathematics functions
#include <setjmp.h> 	// Nonlocal jumps
#include <signal.h> 	// Signal handling
#include <stdalign.h>// (since C11) 	alignas and alignof convenience macros
#include <stdarg.h> 	// Variable arguments
//#include <stdatomic.h>// (since C11) 	Atomic types
#include <stdbool.h> // (since C99) 	Boolean type
#include <stddef.h> 	// Common macro definitions
#include <stdint.h>  // (since C99) 	Fixed-width integer types
#include <stdio.h> 	// Input/output
#include <stdlib.h> 	// General utilities: memory management, program utilities, string conversions, random numbers
#include <stdnoreturn.h> // (since C11) 	noreturn convenience macros
#include <string.h> 	// String handling
#include <tgmath.h>  // (since C99) 	Type-generic math (macros wrapping math.h and complex.h)
//#include <threads.h> // (since C11) 	Thread library
#include <time.h> 	// Time/date utilities
//#include <uchar.h>   // (since C11) 	UTF-16 and UTF-32 character utilities
#include <wchar.h>   // (since C95) 	Extended multibyte and wide character utilities
#include <wctype.h>  // (since C95) 	Wide character classification and mapping utilities

#include <pthread.h>
///====================================================================///////


#define HASH_MAP_SIZE 40

struct HashMap
{
    char prefix[10];
    int id;
};

struct HashMap hashMap[HASH_MAP_SIZE]; /// initialize HashMap

int hashMapCounter = 0; /// counter for total number of HashMap created

pushHashMap(char prefix[], int id)
{
    int location = hashMapCounter; /// structure location
    strcpy(hashMap[location].prefix, prefix);
    hashMap[location].id = id;
    hashMapCounter++;
}

int getID(char prefix[])
{
    int i;
    for( i = 0; i < hashMapCounter; i++) 
    {
        if(!strcmp(hashMap[i].prefix, prefix))
        {
            return hashMap[i].id;
        }
    }
    return -1;  /// id not found
}

/// Driver Program To Test
int main ()
{
    /// inserting data to HashMap
    pushHashMap("88012",2);
    pushHashMap("88011",1);
    pushHashMap("88013",3);
    pushHashMap("88015",5);
    pushHashMap("88014",4);

    printf("ID: %d", getID("88015"));

    return 0;
}
