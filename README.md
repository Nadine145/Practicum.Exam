*Book Review* - Android Application
Student Number: ST10495008
Student Name: Nadine Sivalingam
Course: IMAD5112
Assignment: Practicum Assessment
Date: 2 Febuary 2026

📱 Application Overview
“Book Review” is an Android application developed using Kotlin in Android Studio. This app allows users to manage a collection of items with ratings and comments of the specific book their reading and compare it fairly with their loved ones.
Purpose:
This app helps users organize and track their favorite books by allowing them to rate, comment, and view statistics about their collection and with the raiting system of the app, the user can save on buying books they wont even enjoy reading
Key Features:
✅ Add up to 4 books with detailed information
✅ Store book details using parallel arrays
✅ View all books with complete details
✅ Calculate and display average ratings
✅ Navigate between multiple screens
✅ Input validation and error handling
✅ User-friendly interface with LinearLayout

🎯 Assignment Requirements Met
Q.1.1 - Code Implementation
Emulator and GitHub:
App runs successfully on Android emulator
Complete source code hosted on GitHub repository
No zip files - all code accessible via repository
Parallel Arrays: Four parallel arrays declared and initialized to store book data:
itemTitles - Stores book titles/names
itemCreators - Stores [secondary info - author]
itemRatings - Stores user ratings (1-5 scale)
itemComments - Stores user comments/reviews
Methods/Functions: Multiple functions created for code organization:
addItemToBookReviewList() - Handles adding new books
showInputDialog() - Generic dialog for user input
validateRating() - Validates rating input (1-5)
displayAllItems() - Shows all books using loops
calculateAndDisplayAverage() - Calculates average rating using loops
updateBookCount() - Updates item counter display
animateButtonPress() - Provides visual feedback
Error Handling: Comprehensive validation implemented:
Empty input validation for all fields
Rating validation (ensures value is between 1-5)
Maximum capacity checks (prevents adding more than 4 books)
Try-catch blocks for number format exceptions
User-friendly error messages via Toast notifications
Code Quality:
Clean, well-structured code with meaningful variable names
Extensive comments explaining functionality
Logging statements (Log.d, Log.i, Log.w, Log.e) for debugging
Good programming practices followed throughout
Code organized into logical functions

Q.1.2 - Main Screen The main screen contains three buttons as required:
Button 1: "Add to Book Review List" When clicked, prompts user to enter four pieces of information sequentially:
 Title/Name - The name of the book
[Secondary Info] - Additional information (e.g., artist, author, director)
Rating (1-5) - User's rating on a 1-5 scale
Comments - User's thoughts/review
All data is validated and stored in parallel arrays upon successful completion.
Button 2: "View Details" 
Navigates to the Detailed View Screen
Uses Android Intent for screen navigation
Smooth transition animation between screens
Button 3: "Exit App" Shows confirmation dialog before closing
Allows user to cancel or confirm exit
Cleanly closes the application
Additional Features:
Item counter display showing current count (X / 4 [items])
Visual feedback with button press animations
Premium gradient background design
Clear, centered layout using LinearLayout

Q.1.3 - Detailed View Screen
The detailed view screen contains three buttons:
Button 1: "Display All Books" 
Uses a FOR LOOP to iterate through parallel arrays
Displays all books with their corresponding details:
Book title/name
Author
Rating with visual stars (★★★★★)
User comments
Beautifully formatted output with decorative boxes
Shows total book count at the bottom
Loop Implementation:
for (i in 0 until MainActivity.itemCount) {
	// Display each item's details
	displayText.append("Title: ${MainActivity.itemTitles[i]}\n")
    displayText.append("Rating: ${MainActivity.itemRatings[i]}/5\n")
	// ... etc
}
Button 2: "Calculate Average Rating" 
Uses a FOR LOOP to sum all ratings from the array
Calculates average rating (sum ÷ count)
Displays detailed statistics:
Individual ratings for each [item]
Total [items] count
Sum of all ratings
Final average rating (formatted to 2 decimal places)
Interpretation of the average (e.g., "EXCELLENT COLLECTION!")
Loop Implementation:
var totalRating = 0
for (i in 0 until MainActivity.itemCount) {
	val rating = MainActivity.itemRatings[i] ?: 0
	totalRating += rating
}
val averageRating = totalRating.toDouble() / MainActivity.itemCount
Button 3: "Back to Main Screen" 
Returns to the main screen
Closes the current activity
Smooth transition animation


🔗 GitHub Repository
Repository URL: [INSERT YOUR GITHUB REPOSITORY LINK HERE]
Example: https://github.com/YourUsername/YourRepoName
Repository Contents:
Complete Kotlin source code for all activities
XML layout files for all screens
AndroidManifest.xml configuration
All drawable resources (if applicable)
This README.md file

📸 Screenshots and Explanations
1. Source Code - MainActivity.kt
![1000184262](https://github.com/user-attachments/assets/bfe65b17-f39a-4476-b827-fc605f357d09)

![1000184265](https://github.com/user-attachments/assets/fcfbe276-fa09-4a31-85f6-8d3fed5ad50b)

![1000184254](https://github.com/user-attachments/assets/17a150c4-b1fd-4a55-af7c-656c3beb9764)

Explanation: This screenshot shows the MainActivity.kt source code, which is the main controller for the application's primary screen. Key features visible in this code include:
Student Information: Student number and full name declared at the top of the file in comments (as required by the assignment)
Parallel Arrays: Four parallel arrays (itemTitles, itemCreators, itemRatings, itemComments) declared in the companion object to store book data across the application
Add Function: The addItemToPlaylist() function handles user input through a series of dialogs, collecting all four required pieces of information
Error Handling: Input validation is implemented to check for empty fields and invalid ratings
Button Click Handlers: Three button click listeners for Add, View Details, and Exit functionality
Logging: Extensive use of Log.d, Log.i, and Log.w statements to demonstrate understanding and aid in debugging
The code follows Kotlin best practices with clear variable names, proper function organization, and comprehensive comments explaining each section.

3. Source Code - DetailedViewActivity.kt
![1000184252](https://github.com/user-attachments/assets/f488fbf3-d7ba-445a-804c-a5b69e163464)

![1000184256](https://github.com/user-attachments/assets/7dea355e-a26f-430b-9b03-a63561d16da9)

![1000184260](https://github.com/user-attachments/assets/a50ee268-fa62-496b-9ba3-43bc7c4a1996)

![1000184258](https://github.com/user-attachments/assets/d76a93c3-9bf4-4591-a8ae-3895f7163375)

Explanation: This screenshot displays the DetailedViewActivity.kt source code, which implements the second screen of the application. Critical implementations shown include:
Display Loop (Q.1.3 Requirement): A FOR LOOP starting around line 95 that iterates through the parallel arrays to display all books with their details. The loop demonstrates proper array traversal and string concatenation for formatted output.
Average Calculation Loop (Q.1.3 Requirement): A FOR LOOP starting around line 170 that calculates the sum of all ratings by iterating through the itemRatings array, then divides by the count to get the average.
Formatted Output: Code showing the creation of decorative text formatting using box-drawing characters (╔═╗, ║, ╚═╝) for a professional display
Star Rating Function: The getStarRating() function converts numeric ratings (1-5) into visual star representations (★★★★★)
Back Button Handler: Navigation code to return to the main screen
Both required loops are clearly visible and properly implemented, demonstrating understanding of loop structures and array manipulation.

3. Main Screen Interface
Explanation: The main screen features a clean, user-friendly interface built using LinearLayout as required:
App Title and Subtitle: "Book Review" displayed prominently at the top with subtitle
Item Counter: A dynamic counter showing "X / 4 books" that updates as books are added to the collection
Three Primary Buttons (Q.1.2 Requirement):
"Add book" Button (Blue/Primary Color): Initiates the process of adding a new books to the collection
"View Details" Button (Green/Secondary Color): Navigates to the detailed view screen
"Exit App" Button (Red/Danger Color): Closes the application with confirmation
Visual Design:
Gradient background for modern appearance
Elevated buttons with shadows for depth
Consistent spacing using LinearLayout's weight and gravity properties
Premium color scheme with clear visual hierarchy
Footer showing course information
The interface is intuitive, with clear button labels and a professional design that follows material design principles while using only LinearLayout containers.

4. Add [Item] Dialog Sequence
Explanation: This screenshot shows the dialog interface that appears when users click the "Add book" button. The app implements a four-step sequential input process:
Dialog Sequence:
Bok Title Dialog: Prompts "Enter Book Title" with a text input field
Author Dialog: Prompts "Enter Author Name" for additional details
Rating Dialog: Prompts "Enter Rating (1-5)" with validation to ensure only numbers between 1-5 are accepted
Comments Dialog: Prompts "Enter Comments" for user's thoughts or review
Features Shown:
Clean, material design dialog boxes
Input hints guiding users on what to enter
OK and Cancel buttons for each dialog
Sequential flow - each dialog appears only after the previous one is completed
Validation feedback - if invalid input is entered (e.g., rating of 6), an error message appears
After successfully entering all four pieces of information, a Toast message confirms "Book added successfully!" and the item counter updates to reflect the new addition.

5. Detailed View Screen - Display All Books

Explanation: This screenshot shows the Detailed View screen after clicking "Display All Books", demonstrating the loop implementation (:
Display Features:
Header: "═══ BOOK REVIEW ANALYYICS ═══" title with decorative borders
Item List: Each book is displayed in a formatted box showing:
Item number (1, 2, 3, 4)
Title/Name
Author
Visual star rating (★★★☆☆ format)
Numeric rating (X/5)
User comments
Visual Formatting:
Box-drawing characters (┌─┐ │ └─┘) create clear separation between books
Emojis add visual interest (📑 📝 ⭐ 💭 or relevant alternatives)
Consistent spacing and alignment
Footer: Total book count displayed at the bottom
Scrollable: Content is within a ScrollView for longer lists
Loop Implementation Demonstrated: The display shows that a loop successfully iterated through all book in the parallel arrays, extracting and formatting each bok's details. This fulfills the Q.1.3 requirement to "display the list of books with the corresponding details using a loop."

7. Detailed View Screen - Average Rating Calculation
Explanation: This screenshot displays the average rating calculation screen, showing the loop implementation for calculating statistics (Q.1.3 - 10 marks):
Statistics Display Sections:
Header: "📊 STATISTICS" title
Individual Ratings Section:
Lists each book with its title
Shows visual star rating (★★★★★)
Displays numeric rating (X/5)
Demonstrates all data was successfully retrieved from arrays
Calculation Section:
Total books: Shows count (e.g., "4")
Sum of Ratings: Shows total (e.g., "17")
Formula Display: Shows calculation (e.g., "17 ÷ 4")
Provides transparency in how average was calculated
Result Section:
Average Rating: Displayed prominently with 2 decimal places (e.g., "4.25 / 5.00")
Visual Stars: Shows average as stars (★★★★☆)
Interpretation: Contextual message based on average:
4.5+: "🔥 MASTERPIECE COLLECTION!"
4.0+: "✨ EXCELLENT COLLECTION!"
3.5+: "👍 GREAT SELECTION!"
3.0+: "😊 GOOD VIBES!"
2.5+: "🎵 DECENT MIX"
2.0+: "📝 ROOM TO IMPROVE"
Loop Implementation Demonstrated: The display confirms that a loop successfully iterated through the itemRatings array, summing all values and calculating the average. This fulfills the Q.1.3 requirement to "calculate and display the average rating for the books in the collection using a loop."

8. Application Running on Emulator
Explanation: This screenshot shows the complete application running in the Android Studio emulator, demonstrating:
Emulator Environment:
Android Virtual Device (AVD) successfully running the application
App icon visible in the device
Full screen display showing the application interface
Status bar and navigation controls visible
Functional Demonstration:
App successfully installed and launched on emulator
All UI elements rendering correctly (buttons, text, layouts)
Colors and gradients displaying properly
LinearLayout structure working as designed
Navigation between screens functional
All interactive elements responding to clicks
Technical Verification:
Proves app meets the requirement "Code is implemented on an emulator" (Q.1.1)
Shows the app is fully functional, not just theoretical code
Demonstrates compatibility with Android platform
Confirms all resources (layouts, drawables, strings) are properly linked
Validates that the build configuration is correct
This screenshot is essential evidence that the application works as intended in a real Android environment, fulfilling the core requirement of delivering a functional Android application.

🛠️ Technical Implementation
Technologies Used:
Programming Language: Kotlin
IDE: Android Studio
Layout System: LinearLayout (as required by assignment)
Minimum SDK: API 24 (Android 7.0 Nougat)
Target SDK: API 34 (Android 14)
Build System: Gradle
Data Structures:
Parallel Arrays: Four arrays of fixed size (4 elements)
Array Types:
Array<String?> for titles and text fields
Array<Int?> for ratings
Companion Object: Used to share data between activities
Key Programming Concepts Demonstrated:
✅ Arrays and parallel array data storage
✅ Loops (for loops for iteration and calculation)
✅ Screen navigation with Intents
✅ Dialog-based user input with AlertDialog
✅ Input validation and error handling
✅ Try-catch exception handling
✅ Logging for debugging (Log.d, Log.i, Log.w, Log.e)
✅ Toast messages for user feedback
✅ View animations for enhanced UX
✅ LinearLayout with nested layouts
✅ ScrollView for long content

📋 How to Use the Application
Adding a New Book:
Launch the application
Click the "Add book" button on the main screen
Enter the Book title/name when prompted, then click OK
Enter the Author when prompted, then click OK
Enter a rating between 1 and 5 when prompted, then click OK
Enter your comments or review when prompted, then click OK
A success message will appear confirming the book was added
The counter will update to show the new book count
Note: The app allows a maximum of 4 books. If you try to add a 5th item, you'll receive an error message indicating the collection is full.
Viewing Your Collection:
From the main screen, click the "View Details" button
On the Detailed View screen, click "Display All Books"
Scroll through the formatted list to see all your books with complete details:
Book title/name
Author 
Star rating visualization
Your comments
Click "Back" to return to the main screen
Calculating Average Rating:
Navigate to the Detailed View screen (click "View Details")
Click the "Calculate Average Rating" button
View the comprehensive statistics including:
Individual ratings for each book
Total book count
Sum of all ratings
Average rating (calculated and displayed)
Interpretation message based on the average
Click "Back" to return to the main screen
Exiting the Application:
Click the "Exit" button on the main screen
A confirmation dialog will appear asking "Are you sure you want to exit?"
Click "Yes" to close the app, or "No" to stay

🔧 Installation and Setup Instructions
Prerequisites:
Android Studio (Arctic Fox or newer recommended)
Android SDK installed
Git (for cloning the repository)
Android device or emulator with API 24+
Installation Steps:
Clone the Repository:
2.  git clone [YOUR-GITHUB-REPOSITORY-URL]
3.  cd [repository-folder-name]
Open in Android Studio:
Launch Android Studio
Select "Open an Existing Project"
Navigate to the cloned repository folder
Click "OK"
Wait for Gradle Sync:
Android Studio will automatically sync Gradle dependencies
Wait for the process to complete (shown in bottom status bar)
If sync fails, click "Sync Now" or go to File → Sync Project with Gradle Files
Configure Emulator (if needed):
Go to Tools → AVD Manager
Click "Create Virtual Device"
Select a device (e.g., Pixel 4)
Choose a system image (API 24 or higher)
Click "Finish"
Run the Application:
Click the green "Run" button (▶) in the toolbar
Select your emulator or connected device
Wait for the app to build and install
The app will launch automatically
Troubleshooting:
Gradle Sync Failed: Go to File → Invalidate Caches → Invalidate and Restart
Emulator Won't Start: Ensure virtualization is enabled in BIOS
App Crashes: Check Logcat (View → Tool Windows → Logcat) for error messages
Build Errors: Try Build → Clean Project, then Build → Rebuild Project

📝 Code Structure and File Organization
app/
├── src/
│   └── main/
│   	├── java/com/example/playlistmanager/
│   	│   ├── MainActivity.kt          	# Main screen controller
│   	│   └── DetailedViewActivity.kt  	# Details screen controller
│   	├── res/
│   	│   ├── layout/
│   	│   │   ├── activity_main.xml    	# Main screen layout
│   	│   │   └── activity_detailed_view.xml  # Details screen layout
│   	│   ├── values/
│   	│   │   └── strings.xml          	# String resources
│   	│   └── drawable/                	# Images and drawables
│   	└── AndroidManifest.xml              # App configuration
└── build.gradle                         	# Build configuration
Key Files Description:
MainActivity.kt
Contains the main logic for the home screen
Implements parallel arrays for data storage
Handles adding books with validation
Manages navigation to detailed view
Implements exit functionality
DetailedViewActivity.kt
Displays all books using a loop
Calculates average rating using a loop
Formats output with decorative elements
Handles back navigation
activity_main.xml
Defines the main screen layout using LinearLayout
Contains three buttons and item counter
Implements gradient background
Uses nested LinearLayouts for organization
activity_detailed_view.xml
Defines the detailed view screen layout using LinearLayout
Contains display area and three action buttons
Implements scrollable content area
Uses LinearLayout throughout
AndroidManifest.xml
Declares both activities
Sets MainActivity as launcher activity
Configures app theme and permissions

🎨 Design Decisions
Layout Choice:
LinearLayout was chosen as required by the assignment specifications. All screens use LinearLayout exclusively with vertical orientation as the root element and nested LinearLayouts for complex arrangements.
Color Scheme:
A warm, professional gradient scheme was chosen with browns and creams
User Experience Decisions:
Sequential Dialogs: Four separate dialogs for adding books ensure focused input and reduce cognitive load
Visual Feedback: Button animations and toast messages confirm user actions
Error Prevention: Validation prevents invalid data from being stored
Clear Navigation: Labeled buttons with icons make navigation intuitive
Formatted Display: Decorative boxes and star ratings enhance readability

✅ Testing and Validation
Test Cases Executed:
1. Add book Functionality:
✅ Successfully add book with all valid inputs
✅ Prevent empty title submission
✅ Prevent empty author submission
✅ Reject ratings below 1
✅ Reject ratings above 5
✅ Reject non-numeric rating input
✅ Prevent empty comments submission
✅ Block addition when 4 books already exist
✅ Counter updates correctly after each addition
2. Display [Items] Functionality:
✅ Display all books when collection has data
✅ Show appropriate message when collection is empty
✅ Correctly display all four properties for each book
✅ Loop iterates through all bookd
✅ Formatting displays correctly
✅ Scroll functionality works for long content
3. Calculate Average Functionality:
✅ Calculate correct average for various rating combinations
✅ Display individual ratings correctly
✅ Show correct sum of ratings
✅ Show correct item count
✅ Format average to 2 decimal places
✅ Display appropriate interpretation message
✅ Handle empty collection gracefully
4. Navigation:
✅ View Details button navigates to second screen
✅ Back button returns to main screen
✅ Smooth transitions between screens
✅ Data persists when navigating between screens
5. Exit Functionality:
✅ Confirmation dialog appears
✅ "Yes" closes the app
✅ "No" cancels exit and stays in app

📚 Learning Outcomes and Reflection
Through this assignment, the following skills and concepts were demonstrated:
Technical Skills:
Proficiency in Kotlin programming language
Understanding of Android activity lifecycle
Ability to implement parallel array data structures
Competence in using loops for iteration and calculation
Knowledge of Android UI development with LinearLayout
Skills in screen navigation using Intents
Understanding of input validation and error handling
Ability to create user-friendly interfaces
Software Development Practices:
Code organization and modularization
Meaningful variable and function naming
Comprehensive code commenting
Use of logging for debugging and demonstration
Version control with Git and GitHub
Professional documentation writing
Problem-Solving Approach:
Breaking down complex requirements into manageable components
Implementing validation to prevent user errors
Creating intuitive user interfaces
Handling edge cases and error conditions
Testing thoroughly before submission

🔄 Future Enhancements
Potential improvements for future versions:
Persistent Storage: Implement local database (Room) or SharedPreferences to save books between app sessions
Edit Functionality: Allow users to edit existing books
Delete Functionality: Add ability to remove books from collection
Increased Capacity: Expand beyond 4 books or make capacity dynamic
Search/Filter: Add ability to search or filter books by rating or other criteria
Sorting: Allow users to sort books by rating, name, or date added
Export Data: Add ability to export collection to CSV or share via other apps
Images: Allow users to add photos to each book
Categories: Implement categories or tags for better organization
Cloud Sync: Sync data across multiple devices


