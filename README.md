# NIRF College Explorer

NIRF College Explorer is an Android application that allows users to explore engineering colleges based on their NIRF rankings.

The application provides rank-wise and band-wise browsing, college search, NIRF scores, and detailed college information through a simple and user-friendly interface.


##  Features

  -  **Rank-wise College Listing**
  - Browse colleges according to their NIRF engineering rank.

  -  **Rank Band-wise Exploration**
  - Explore colleges through different rank ranges:
    - Rank 1 - 10
    - Rank 11 - 20
    - Rank 21 - 50
    - Rank 51 - 100

 -  **College Search**
  - Search colleges by name, city, or state.

 -  **NIRF Score**
  - View the NIRF score of each institution.

 -  **College Details**
  - View rank, score, city, state, and institution type.

 -  **User-friendly Android UI**
  - Warm academic-themed interface designed for easy navigation.

 -  **Local JSON Data**
  - College information is loaded from a JSON dataset included within the application.



## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Application logic |
| XML | User interface design |
| Android Studio | Development environment |
| RecyclerView | College list display |
| JSON | College data storage |
| Gradle | Build and dependency management |



##  Application Flow

```text
Home Screen
    │
    ├── NIRF Rank Wise
    │       │
    │       ├── Search College
    │       │
    │       └── College Details
    │
    └── NIRF Band Wise
            │
            ├── Rank 1 - 10
            ├── Rank 11 - 20
            ├── Rank 21 - 50
            └── Rank 51 - 100
                    │
                    └── College Details
```

# Project Structure
```text
NIRF-College-Explorer/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/nirfcollegeexplorer/
│           │       ├── MainActivity.java
│           │       ├── RankWiseActivity.java
│           │       ├── BandWiseActivity.java
│           │       ├── College.java
│           │       ├── CollegeAdapter.java
│           │       ├── CollegeData.java
│           │       └── CollegeDetailsActivity.java
│           │
│           ├── assets/
│           │   └── colleges.json
│           │
│           └── res/
│               ├── drawable/
│               ├── layout/
│               ├── mipmap/
│               └── values/
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
└── README.md
```

# Getting Started
Prerequisites
- Android Studio
- Android SDK
- Java
- Android device or emulator
Installation
1. Clone the repository:
git clone https://github.com/Afiyafatima08/NIRF-College-Explorer.git

2. Open the project in Android Studio.
3. Allow Gradle to sync and download the required dependencies.
4. Connect an Android device or start an emulator.
5. Click Run ▶ in Android Studio.

# Data
The application uses a local JSON file:
app/src/main/assets/colleges.json

The dataset contains information such as:
- NIRF rank
- College name
- City
- State
- Institution type
- NIRF score

# Future Improvements
Possible future enhancements include:
- Online NIRF data updates
- College comparison
- Advanced filtering
- Favorites/bookmarks
- College location on maps
- College website links
- User accounts
- Cloud database integration

# License
This project was developed as an academic/course project.
