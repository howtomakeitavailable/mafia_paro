<script>
    function scrollToTop() {
        window.scrollTo({
            top: 0,
            behavior: 'smooth' // For smooth scrolling effect
        });
    }
    window.onscroll = function() {
        var backToTopBtn = document.getElementById("backToTopBtn");
        if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
          backToTopBtn.style.display = "block";
        } else {
          backToTopBtn.style.display = "none";
        }
      };
</script>
