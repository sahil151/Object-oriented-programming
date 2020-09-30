#include <iostream>
using namespace std;
class BubbleSort {
public:
    void bubble(int arr[], int size);
    void driver();
    void display();
    int arr[50];
    int array_size;
    int temp;
};
void BubbleSort::driver() {
    cout<<"Enter size of List:" << endl;
    cin>>array_size;
    cout<<"Enter " << array_size << " values" << endl;
    cout << endl;
    for(int b = 0; b <= array_size -1; b++) {
        cout << "Value [" << b << "]:";
        cin>>arr[b];
     }
     cout << "Your unsorted list  is given below: [ ";
    for(int c = 0; c <= array_size -1; c++){
        cout << arr[c] << " " ;
    }
        cout << "]" << endl;
        display();
}
void BubbleSort::bubble(int arr[], int array_size) {
    for (int k = 0; k < array_size; k++)
        for (int i = 0; i < array_size -k -1; i++)
            if (arr[i] > arr[i +1]){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
      }
}
void BubbleSort::display() {
    bubble(arr,array_size);
        cout << "Your sorted list: [ ";
        for(int x = 0; x < array_size; x++) {
            cout << arr[x] << " ";
        }
        cout << "]";
}
int main () {
    BubbleSort frank;
    frank.driver();
    return 0;
}
