<link href="/css/material-bootstrap-wizard.css" rel="stylesheet">
<div id="createprofile" class="wizard-container modal p-0">
    <div class="card wizard-card bg-dark" data-color="red" id="wizard">
        <form action="" method="">
            <div class="wizard-navigation">
                <ul>
                    <li><a href="#testwiz" data-toggle="tab">test Details</a></li>
                    <li><a href="#persinfowiz" data-toggle="tab">Personal Details</a></li>
                    <li><a href="#eduinfowiz" data-toggle="tab">Education Details</a></li>
                    <li><a href="#faminfowiz" data-toggle="tab">Family Details</a></li>
                    <li><a href="#socinfowiz" data-toggle="tab">Social Details</a></li>
                    <li><a href="#partinfowiz" data-toggle="tab">Partner Details</a></li>
                </ul>
            </div>
            <div class="tab-content">
                <div class="tab-pane" id="testwiz">
                <div class="row">
                    <div class="col-sm-6">

                            <div class="form-group label-floating">
                                <label class="control-label">Your Email</label>
                                <input name="name" type="text" class="form-control">
                            </div>


                            <div class="form-group label-floating">
                                <label class="control-label">Your Password</label>
                                <input name="name2" type="password" class="form-control">
                            </div>

                            <div class="form-group label-floating">
                                <label class="control-label">Your Password</label>
                                <input name="name2" type="password" class="form-control">
                            </div>


                            <div class="form-group label-floating">
                                <label class="control-label">Your Password</label>
                                <input name="name2" type="password" class="form-control">
                            </div>

                    </div>
                    <div class="col-sm-6">

                            <div class="form-group label-floating">
                                <label class="control-label">Your Email</label>
                                <input name="name" type="text" class="form-control">

                        </div>

                            <div class="form-group label-floating">
                                <label class="control-label">Your Password</label>
                                <input name="name2" type="password" class="form-control">
                            </div>

                            <div class="form-group label-floating">
                                <label class="control-label">Your Password</label>
                                <input name="name2" type="password" class="form-control">
                            </div>

                            <div class="form-group label-floating">
                                <label class="control-label">Your Password</label>
                                <input name="name2" type="password" class="form-control">
                            </div>

                    </div>
                </div>
                </div>
                <div class="tab-pane" id="persinfowiz">
                    <jsp:include page="persinfowiz.jsp" />
                </div>
                <div class="tab-pane" id="eduinfowiz">
                    <jsp:include page="eduinfowiz.jsp" />
                </div>
                <div class="tab-pane" id="faminfowiz">
                    <jsp:include page="faminfowiz.jsp" />
                </div>
                <div class="tab-pane" id="socinfowiz">
                    <jsp:include page="socinfowiz.jsp" />
                </div>
                <div class="tab-pane" id="partinfowiz">
                    <jsp:include page="partinfowiz.jsp" />
                </div>
            </div>
            <div class="wizard-footer">
                <div class="pull-right">
                    <input type='button' class='btn btn-next btn-fill btn-danger btn-wd' name='next' value='Next' />
                </div>
                <div class="pull-left">
                    <input type='button' class='btn btn-previous btn-fill btn-default btn-wd' name='previous' value='Previous' />
                </div>
            </div>
        </form>
    </div>
</div>