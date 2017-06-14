#include <iostream>       // std::cout
#include <thread>         // std::thread

void foo()
{
	for (int i = 0; i < 1500000000; i++);
}

void bar(int x)
{
	for (int i = 0; i < 1500000000; i++);
}
using namespace std;
int main()
{
	std::thread first(foo);     // spawn new thread that calls foo()
	std::thread second(bar, 0);  // spawn new thread that calls bar(0)

	std::thread third(foo);
	std::thread fourth(foo);

	std::cout << "main, foo and bar now execute concurrently...\n";

	// synchronize threads:

	first.join();                // pauses until first finishes
	second.join();               // pauses until second finishes
	third.join();
	fourth.join();

	std::cout << "foo and bar completed.\n";

	cout << "Done in " << clock() * 1000 / CLOCKS_PER_SEC << endl;

	getchar();

	return 0;
}
