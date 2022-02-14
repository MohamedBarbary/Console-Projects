#include<bits/stdc++.h>
#include <iostream>
#include <fstream>
using namespace std;
#define endl '\n';
#define loop(n)    for(int i=0;i<n;i++)
#define loopl(n)   for(long i=0;i<n;i++)
#define loop1(n)    for(int j=0;j<n;j++)
#define loop2(n1,n2)   for(int i=0,j=0;i<n1,j<n2;i++,j++)
#define loopr(n)        for(int i=n-1;i>=0;i--)
typedef long long ll;
void init() {
    cin.tie(0);
    cin.sync_with_stdio(0);
}
typedef long long ll;
void solve(){
}
struct doctor {
    string name ;
    string email;
    string phoneNumber;
    int id;
    vector<string>doctorCourses;
public:
    doctor();
    doctor(int id ,string email,string phoneNumber)
    {
        this->id=id;
        this->name=name;
        this->email=email;
        this->phoneNumber=phoneNumber;
    }
};


int main () {
    int logout=0;
    do {
        logout=0;
        cout << "Enter your academic position >> ";
        string academicPosition;
        cin >> academicPosition;
        if (academicPosition == "doctor" || academicPosition == "Doctor") {
            cout << "Enter your name doctor >> ";
            doctor firstDoctor;
            cin >> firstDoctor.name;
            if (firstDoctor.name == "Mohamed" || firstDoctor.name == "mohamed") {
                firstDoctor = *new doctor(2112, "moahmedalbarbary0@gamil.com", "01224154921");
                cout << "id : " << firstDoctor.id << " " << "Phone : " << firstDoctor.phoneNumber << endl;
                cout << "Email : " << firstDoctor.email << endl;
                cout << "Choose number form check list :" << endl;
                cout << " 1-list of courses " << " 2-view courses " << " 3-create courses " << " 4- logout "
                     << endl;
                int checkNumber1;
                cin >> checkNumber1;
                if (checkNumber1 == 4) {
                    logout = 4;
                    // end logout
                } else if (checkNumber1 == 1) {
                    cout << " 1-Programming1 " << " 2-Logic1 " << " 3-Math " << " 4-Circuits " << endl;
                    // end list of courses
                } else if (checkNumber1 == 2) {
                    // start view courses
                    int back = 0;
                    do {
                        back = 0;
                        cout << " 1-doctor courses " << " 2-view assignment " << " 3-create assignment "
                             << " 4-back "
                             << endl;
                        int checkNumber2;
                        cin >> checkNumber2;
                        if (checkNumber2 == 4) {
                            back = 4;
                        } else if (checkNumber2 == 1) {

                            loop(firstDoctor.doctorCourses.size()) {
                                cout << firstDoctor.doctorCourses[i] << " ";
                            }
                            cout << endl;
                        }else if(checkNumber2==3){

                        }else if(checkNumber2==2){
                            cout << "";
                        }
                    } while (back != 4);
                    // end view course
                }else if(checkNumber1==3){
                    // start create courses
                    cout << "Enter number of new courses >> ";
                    int numberOfNewCourses;cin>>numberOfNewCourses;
                    loop(numberOfNewCourses){
                        cout << "Enter courses name : ";
                        string courseName;cin>>courseName;
                        firstDoctor.doctorCourses.push_back(courseName);
                        cout << endl;
                    }
                    // end create courses
                }
            } else if (firstDoctor.name == "Ali" || firstDoctor.name == "ali") {
                firstDoctor = *new doctor(1112, "alibarbary0@gamil.com", "01224154921");
                firstDoctor.doctorCourses.push_back("Math1");
                firstDoctor.doctorCourses.push_back("Circuits");
            }
        }else if(){}
    }while(logout!=4);
    return 0;
}
