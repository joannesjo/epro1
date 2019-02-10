$( document ).ready(function() {
    $("#persinforesultdiv").hide();
    $( "#login" ).click(function() {

        $.ajax({
            url: '/login',
            success: function (response) {
                window.location.href = "/index";
            },
            error: function (jqXHR, exception) {
                var msg = '';
                if (jqXHR.status === 0) {
                    msg = 'Not connect.\n Verify Network.';
                } else if (jqXHR.status == 404) {
                    msg = 'Requested page not found. [404]';
                } else if (jqXHR.status == 500) {
                    msg = 'Internal Server Error [500].';
                } else if (exception === 'parsererror') {
                    msg = 'Requested JSON parse failed.';
                } else if (exception === 'timeout') {
                    msg = 'Time out error.';
                } else if (exception === 'abort') {
                    msg = 'Ajax request aborted.';
                } else {
                    msg = 'Uncaught Error.\n' + jqXHR.responseText;
                }
                alert("msg = "+msg);
            },
        });
    });




    $('.jarallax').jarallax()
    $('.jarallax').jarallax({

        // parallax effect speed. 0.0 - 1.0
        speed             : 0.5,

        // path to your parallax image
        imgSrc            : null,

        // width & height of your parallax image
        imgWidth          : null,
        imgHeight         : null,

        // enable transformations for effect if supported.
        enableTransform   : true,

        // z-index of parallax container.
        zIndex            : -100

    })

    //$('.my-flipster').flipster();
    //var myFlipster = $('.my-flipster').flipster(); // It's best to store the element as a variable for easy reference.

    var myFlipster =   $('.my-flipster').flipster({
        itemContainer: 'ul',
        // [string|object]
        // Selector for the container of the flippin' items.

        itemSelector: 'li',
        // [string|object]
        // Selector for children of `itemContainer` to flip

        start: 'center',
        // ['center'|number]
        // Zero based index of the starting item, or use 'center' to start in the middle

        fadeIn: 400,
        // [milliseconds]
        // Speed of the fade in animation after items have been setup

        loop: true,
        // [true|false]
        // Loop around when the start or end is reached

        autoplay: 2000,
        // [false|milliseconds]
        // If a positive number, Flipster will automatically advance to next item after that number of milliseconds

        pauseOnHover: true,
        // [true|false]
        // If true, autoplay advancement will pause when Flipster is hovered

        style: 'coverflow',
        // [coverflow|carousel|flat|...]
        // Adds a class (e.g. flipster--coverflow) to the flipster element to switch between display styles
        // Create your own theme in CSS and use this setting to have Flipster add the custom class

        spacing: -0.25,
        // [number]
        // Space between items relative to each item's width. 0 for no spacing, negative values to overlap

        click: true,
        // [true|false]
        // Clicking an item switches to that item

        keyboard: true,
        // [true|false]
        // Enable left/right arrow navigation

        scrollwheel: true,
        // [true|false]
        // Enable mousewheel/trackpad navigation; up/left = previous, down/right = next

        touch: true,
        // [true|false]
        // Enable swipe navigation for touch devices

        nav: true,
        // [true|false|'before'|'after']
        // If not false, Flipster will build an unordered list of the items
        // Values true or 'before' will insert the navigation before the items, 'after' will append the navigation after the items

        buttons: true,
        // [true|false|'custom']
        // If true, Flipster will insert Previous / Next buttons with SVG arrows
        // If 'custom', Flipster will not insert the arrows and will instead use the values of `buttonPrev` and `buttonNext`

        buttonPrev: 'Previous',
        // [text|html]
        // Changes the text for the Previous button

        buttonNext: 'Next',
        // [text|html]
        // Changes the text for the Next button
        onItemSwitch: function(currentItem, previousItem){
            //console.log('Current item is ', "testing");
           // alert("testing");
        }
        //onItemSwitch: false
        // [function]
        // Callback function when items are switched
        // Arguments received: [currentItem, previousItem]
    });


    myFlipster.flipster('next'); // Next item
    myFlipster.flipster('prev'); // Previous item
    myFlipster.flipster('jump', 0); // Jump to a specific index
    myFlipster.flipster('jump', $('.my-item')); // Jump to a specific item
    myFlipster.flipster('play'); // Resume autoplay
    myFlipster.flipster('play', 5000); // Set autoplay duration
    myFlipster.flipster('pause'); // Pause the autoplay until next jump
    myFlipster.flipster('stop'); // Stop the autoplay entirely
    myFlipster.flipster('index'); // If items are added or removed, you can tell Flipster to reindex


    $( "#savepersinfo" ).click(function() {

        $.ajax({
            url: '/savepersinfo',
            success: function (response) {
                $("#persinforesultdiv").show();
                alert("success");
                window.setTimeout(function(){
                    window.location.href = "index";
                }, 6000);
            },
            error: function (jqXHR, exception) {
                var msg = '';
                if (jqXHR.status === 0) {
                    msg = 'Not connect.\n Verify Network.';
                } else if (jqXHR.status == 404) {
                    msg = 'Requested page not found. [404]';
                } else if (jqXHR.status == 500) {
                    msg = 'Internal Server Error [500].';
                } else if (exception === 'parsererror') {
                    msg = 'Requested JSON parse failed.';
                } else if (exception === 'timeout') {
                    msg = 'Time out error.';
                } else if (exception === 'abort') {
                    msg = 'Ajax request aborted.';
                } else {
                    msg = 'Uncaught Error.\n' + jqXHR.responseText;
                }
                alert("msg = "+msg);
            },
        });
    });

});