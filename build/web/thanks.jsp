<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Survey Submitted</title>
    <link rel="stylesheet" href="thanks.css" type="text/css"/>
</head>
<body class="thank-you-body">
    <h1 class="thank-you-header">Thank You for Completing the Survey!</h1>

    <section class="survey-info">
        <p class="survey-description">Here is the information you provided:</p>

        <div class="info-item">
            <label>First Name:</label>
            <span>${surveyData.firstName}</span>
        </div>

        <div class="info-item">
            <label>Last Name:</label>
            <span>${surveyData.lastName}</span>
        </div>

        <div class="info-item">
            <label>Email:</label>
            <span>${surveyData.email}</span>
        </div>

        <div class="info-item">
            <label>Date of Birth:</label>
            <span>${surveyData.dob}</span>
        </div>

        <div class="info-item">
            <label>How You Heard About Us:</label>
            <span>${surveyData.howHeard}</span>
        </div>

        <div class="info-item">
            <label>Preferred Contact Method:</label>
            <span>${surveyData.contactMethod}</span>
        </div>
    </section>


    <section class="submit-another">
        <p>If you'd like to submit another survey, click the button below.</p>
        <form action="survey" method="get">
            <input type="submit" value="Return to Survey" class="submit-btn">
        </form>
    </section>
</body>
</html>
