#include <iostream>
#include <ctime>

using namespace std;

void PrintIntroduction(int Difficulty)
{
    cout << "\n\nYou are a secret agent breaking into a level " << Difficulty;
    cout << " secure server room. . .\nEnter the correct code to continue. . .\n\n";
}

bool PlayGame(int Difficulty){

    PrintIntroduction(Difficulty);

    //Generate numbers for the code
    const int CodeA = rand() % Difficulty + Difficulty;
    const int CodeB = rand() % Difficulty + Difficulty;
    const int CodeC = rand() % Difficulty + Difficulty;

    const int CodeSum = CodeA + CodeB + CodeC;
    const int CodeProduct = CodeA * CodeB * CodeC;

    //Print CodeSum and CodeProduct to the terminal
    cout << "There are 3 numbers in the code";
    cout << "\n The codes add up to: " << CodeSum;
    cout << "\n The codes multiply to give: " << CodeProduct << endl;

    //store player guess
    int GuessA, GuessB, GuessC;
    cin >> GuessA >> GuessB >> GuessC;

    int GuessSum = GuessA + GuessB + GuessC;
    int GuessProduct = GuessA * GuessB * GuessC;

    if (GuessSum == CodeSum && GuessProduct == CodeProduct)
    {
        cout << "\nGood job, if I say so myself, keep extracting files";
        return true;
    }
    else    
    {
        cout << "\nYou entered the wrong code, file not extracted. CAREFUL AGENT" << endl;
        return false;
    }
    
}
int main()
{
    srand(time(NULL)); //create new sequence based on the time of day

    int LevelDifficulty = 1;
    const int Maxlevel = 6;
    
    //loop game until all levels are completed
    while(LevelDifficulty <= Maxlevel) 
    {
        bool bLevelComplete = PlayGame(LevelDifficulty);
        cin.clear();
        cin.ignore();

        if(bLevelComplete)
        {
            //increase the level of difficulty
            ++LevelDifficulty;
        }
    }

    cout << "***Congratulation you passed all the levels. Get out of there, QUICK!***" << endl;

    return 0;

}