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
     vector<pair<string ,int >>doctorAssignment;
public:
    doctor(){

    }
    doctor(int id ,string email,string phoneNumber)
    {
        this->id=id;
        this->email=email;
        this->phoneNumber=phoneNumber;
    }
};


int main () {
    int logout = 0;
    do {
        logout = 0;
        // initial general data
        vector<string>totalCourses;
        vector<pair<pair<string,string>,pair<int,int>>>assignmentDegrees;
        totalCourses.emplace_back("programming1");
        totalCourses.emplace_back("Logic");
        totalCourses.emplace_back("Math1");
        totalCourses.emplace_back("Circuits");
        cout << "Enter your academic position >> ";
        string academicPosition;
        cin >> academicPosition;
        if (academicPosition == "doctor" || academicPosition == "Doctor") {
            cout << "Enter your name doctor >> ";
            doctor firstDoctor = *new doctor();
            cin >> firstDoctor.name;
            if (firstDoctor.name == "Mohamed" || firstDoctor.name == "mohamed") {
                // this code is an initial data
                firstDoctor = *new doctor(2112, "moahmedalbarbary0@gamil.com", "01224154921");
                cout << "id : " << firstDoctor.id << " " << "Phone : " << firstDoctor.phoneNumber << endl;
                cout << "Email : " << firstDoctor.email << endl;
                cout << "Choose number form check list :" << endl;
                firstDoctor.doctorCourses.emplace_back("programming1");
                firstDoctor.doctorCourses.emplace_back("logic");
                firstDoctor.doctorAssignment.emplace_back(make_pair("DataTypes",5));
                  // end initial data
                int back = 0;
                do {
                    back = 0;
                    cout << " 1-list of courses " << " 2-view courses " << " 3-create courses " << " 4- logout "
                         << endl;
                    int checkNumber1;
                    cin >> checkNumber1;
                    if (checkNumber1 == 4) {
                        logout = 4;
                        back=4;
                        // end logout
                    } else if (checkNumber1 == 1) {
                            for(int i=0;i<totalCourses.size();i++){
                                cout << i+1 << "- " <<totalCourses[i]<<" ";
                            } cout << endl;
                        // end list of courses
                    } else if (checkNumber1 == 2) {
                        // start view courses
                        cout << " 1-doctor courses " << " 2-view assignment " << " 3-create assignment "
                             << " 4-back "
                             << endl;
                        int checkNumber2;
                        cin >> checkNumber2;
                        if (checkNumber2 == 4) {
                            back = 4;
                        } else if (checkNumber2 == 1) {
                            for (int i = 0; i < firstDoctor.doctorCourses.size(); i++) {
                                cout << firstDoctor.doctorCourses[i] << "   ";
                            }
                            cout << endl;
                        } else if (checkNumber2 == 3) {
                            cerr<< "Enter number of assignments >> ";
                              int numberOfAssignments ;cin>>numberOfAssignments;
                            loop(numberOfAssignments){
                                  cout << "Enter assignment name >> ";
                                  string assignment ; cin>>assignment;
                                  cout << "Enter assignment degree >> ";
                                  int assignmentDegree; cin>>assignmentDegree;
                                    firstDoctor.doctorAssignment.emplace_back(make_pair(assignment,assignmentDegree));
                              }
                        } else if (checkNumber2 == 2) {
                            cout <<"1-list of assignments "<<"2-set Degree "<<"3-view Degrees "<< endl;
                            int checkToAssignment;cin>>checkToAssignment;
                            if(checkToAssignment==1) {
                                for(int i=0;i<firstDoctor.doctorAssignment.size();i++){
                                    cout << i+1 <<" : " << firstDoctor.doctorAssignment[i].first;
                                    cout << "     #Degree : "<< firstDoctor.doctorAssignment[i].second<<endl;
                                }
                            }else if(checkToAssignment==2){
                                cerr << "Enter number of students wont to set >> ";
                                int studentsNumber;cin>>studentsNumber;
                                for (int i = 0; i <studentsNumber ; ++i) {
                                    cout << "Enter student course name and student name >> ";
                                    string assignmentName,studentName; cin>>assignmentName>>studentName ;
                                    cout << "Enter student degree and total degree >> ";
                                    int studentDegree,totalDegree; cin>>studentDegree>>totalDegree;
                                    assignmentDegrees.emplace_back
                                            (make_pair(make_pair(assignmentName,studentName),
                                                       make_pair(studentDegree,totalDegree)));
                                }  cout <<  endl;
                            }else if(checkToAssignment==3){
                                for (auto x:assignmentDegrees) {
                                    cout <<x.first.first<<endl;
                                    cout << x.first.second << " your degree : #" << x.second.first<<" / "<< x.second.second << endl;
                                }
                            }
                        }
                    }
                    // end view course
                else if(checkNumber1==3){
                    // start create courses
                    cerr << "Enter number of new courses >> ";
                    int numberOfNewCourses;
                    cin >> numberOfNewCourses;
                        while (numberOfNewCourses--) {
                        cout << "Enter courses name : ";
                        string courseName;
                        cin >> courseName;
                        firstDoctor.doctorCourses.emplace_back(courseName);
                        totalCourses.emplace_back(courseName);
                    } cout << endl;
                    // end create courses
                }
                } while (back != 4);
            } else if (firstDoctor.name == "Ali" || firstDoctor.name == "ali") {
                firstDoctor = *new doctor(1112, "alibarbary0@gamil.com", "01224154921");
                firstDoctor.doctorCourses.emplace_back("Math1");
                firstDoctor.doctorCourses.emplace_back("Circuits");
            }
        }
     }while(logout!=4);
    cout << endl;
        cout << "Sign in again !"<<endl;
    return 0;
}
