package com.app.assigmenttask.response;

import java.util.ArrayList;
import java.util.List;

public class ResponseRestaurant {
    private Integer statusCode;
    private String message;
    private Data data;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Amenety {
        private Integer id;
        private Integer propertyId;
        private String amenity;
        private String amenityLogo;
        private String logoAmenityUrl;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(Integer propertyId) {
            this.propertyId = propertyId;
        }

        public String getAmenity() {
            return amenity;
        }

        public void setAmenity(String amenity) {
            this.amenity = amenity;
        }

        public String getAmenityLogo() {
            return amenityLogo;
        }

        public void setAmenityLogo(String amenityLogo) {
            this.amenityLogo = amenityLogo;
        }

        public String getLogoAmenityUrl() {
            return logoAmenityUrl;
        }

        public void setLogoAmenityUrl(String logoAmenityUrl) {
            this.logoAmenityUrl = logoAmenityUrl;
        }
    }

    public class Cuisine {
        private Integer id;
        private Integer propertyId;
        private Integer cuisineId;
        private Cuisine_ cuisine;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(Integer propertyId) {
            this.propertyId = propertyId;
        }

        public Integer getCuisineId() {
            return cuisineId;
        }

        public void setCuisineId(Integer cuisineId) {
            this.cuisineId = cuisineId;
        }

        public Cuisine_ getCuisine() {
            return cuisine;
        }

        public void setCuisine(Cuisine_ cuisine) {
            this.cuisine = cuisine;
        }
    }

    public class Cuisine_ {
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class CustomerReview {
        private Integer id;
        private Integer ratings;
        private String customerReview;
        private Integer bookingId;
        private Integer propertyId;
        private String createdAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getRatings() {
            return ratings;
        }

        public void setRatings(Integer ratings) {
            this.ratings = ratings;
        }

        public String getCustomerReview() {
            return customerReview;
        }

        public void setCustomerReview(String customerReview) {
            this.customerReview = customerReview;
        }

        public Integer getBookingId() {
            return bookingId;
        }

        public void setBookingId(Integer bookingId) {
            this.bookingId = bookingId;
        }

        public Integer getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(Integer propertyId) {
            this.propertyId = propertyId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }
    }

    public class Data {
        private Restaurants restaurants;

        public Restaurants getRestaurants() {
            return restaurants;
        }

        public void setRestaurants(Restaurants restaurants) {
            this.restaurants = restaurants;
        }
    }

    public class Datum {
        private Integer id;
        private Object smokingArea;
        private Object userId;
        private String name;
        private String description;
        private String email;
        private String tel;
        private String address;
        private String city;
        private String region;
        private String zip;
        private Integer countryId;
        private String lat;
        private String lng;
        private String created;
        private String opensAt;
        private String closesAt;
        private String website;
        private Integer isActive;
        private Integer isVerified;
        private String averageRating;
        private Integer totalReviews;
        private Object avgPrice;
        private Object minPrice;
        private Object maxPrice;
        private Integer policyId;
        private Object dressCodeId;
        private Object venueId;
        private Object cuisineId;
        private String distance;
        private Object priceLength;
        private Integer propertyAvgRating;
        private List<PropertyBookingTimeSlot> propertyBookingTimeSlots = new ArrayList<PropertyBookingTimeSlot>();
        private List<ModifiedWeekday> modifiedWeekdays = new ArrayList<ModifiedWeekday>();
        private Object logo;
        private String shareurl;
        private List<Cuisine> cuisines = new ArrayList<Cuisine>();
        private List<Policy> policies = new ArrayList<Policy>();
        private List<Image> images = new ArrayList<Image>();
        private List<CustomerReview> customerReview = new ArrayList<CustomerReview>();
        private Object dresscode;
        private Object vanueType;
        private List<RestaurantPropertySeatType> restaurantPropertySeatType = new ArrayList<RestaurantPropertySeatType>();
        private List<RestaurantPropertyFoodType> restaurantPropertyFoodType = new ArrayList<RestaurantPropertyFoodType>();
        private List<RestaurantPropertyDinnerType> restaurantPropertyDinnerType = new ArrayList<RestaurantPropertyDinnerType>();
        private List<RestaurantPropertyAmenity> restaurantPropertyAmenities = new ArrayList<RestaurantPropertyAmenity>();
        private List<RestaurantWeekday> restaurantWeekdays = new ArrayList<RestaurantWeekday>();
        private List<RestoPropertyPrice> restoPropertyPrice = new ArrayList<RestoPropertyPrice>();
        private List<Restotype> restotype = new ArrayList<Restotype>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getSmokingArea() {
            return smokingArea;
        }

        public void setSmokingArea(Object smokingArea) {
            this.smokingArea = smokingArea;
        }

        public Object getUserId() {
            return userId;
        }

        public void setUserId(Object userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public void setCountryId(Integer countryId) {
            this.countryId = countryId;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getOpensAt() {
            return opensAt;
        }

        public void setOpensAt(String opensAt) {
            this.opensAt = opensAt;
        }

        public String getClosesAt() {
            return closesAt;
        }

        public void setClosesAt(String closesAt) {
            this.closesAt = closesAt;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public Integer getIsActive() {
            return isActive;
        }

        public void setIsActive(Integer isActive) {
            this.isActive = isActive;
        }

        public Integer getIsVerified() {
            return isVerified;
        }

        public void setIsVerified(Integer isVerified) {
            this.isVerified = isVerified;
        }

        public String getAverageRating() {
            return averageRating;
        }

        public void setAverageRating(String averageRating) {
            this.averageRating = averageRating;
        }

        public Integer getTotalReviews() {
            return totalReviews;
        }

        public void setTotalReviews(Integer totalReviews) {
            this.totalReviews = totalReviews;
        }

        public Object getAvgPrice() {
            return avgPrice;
        }

        public void setAvgPrice(Object avgPrice) {
            this.avgPrice = avgPrice;
        }

        public Object getMinPrice() {
            return minPrice;
        }

        public void setMinPrice(Object minPrice) {
            this.minPrice = minPrice;
        }

        public Object getMaxPrice() {
            return maxPrice;
        }

        public void setMaxPrice(Object maxPrice) {
            this.maxPrice = maxPrice;
        }

        public Integer getPolicyId() {
            return policyId;
        }

        public void setPolicyId(Integer policyId) {
            this.policyId = policyId;
        }

        public Object getDressCodeId() {
            return dressCodeId;
        }

        public void setDressCodeId(Object dressCodeId) {
            this.dressCodeId = dressCodeId;
        }

        public Object getVenueId() {
            return venueId;
        }

        public void setVenueId(Object venueId) {
            this.venueId = venueId;
        }

        public Object getCuisineId() {
            return cuisineId;
        }

        public void setCuisineId(Object cuisineId) {
            this.cuisineId = cuisineId;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public Object getPriceLength() {
            return priceLength;
        }

        public void setPriceLength(Object priceLength) {
            this.priceLength = priceLength;
        }

        public Integer getPropertyAvgRating() {
            return propertyAvgRating;
        }

        public void setPropertyAvgRating(Integer propertyAvgRating) {
            this.propertyAvgRating = propertyAvgRating;
        }

        public List<PropertyBookingTimeSlot> getPropertyBookingTimeSlots() {
            return propertyBookingTimeSlots;
        }

        public void setPropertyBookingTimeSlots(List<PropertyBookingTimeSlot> propertyBookingTimeSlots) {
            this.propertyBookingTimeSlots = propertyBookingTimeSlots;
        }

        public List<ModifiedWeekday> getModifiedWeekdays() {
            return modifiedWeekdays;
        }

        public void setModifiedWeekdays(List<ModifiedWeekday> modifiedWeekdays) {
            this.modifiedWeekdays = modifiedWeekdays;
        }

        public Object getLogo() {
            return logo;
        }

        public void setLogo(Object logo) {
            this.logo = logo;
        }

        public String getShareurl() {
            return shareurl;
        }

        public void setShareurl(String shareurl) {
            this.shareurl = shareurl;
        }

        public List<Cuisine> getCuisines() {
            return cuisines;
        }

        public void setCuisines(List<Cuisine> cuisines) {
            this.cuisines = cuisines;
        }

        public List<Policy> getPolicies() {
            return policies;
        }

        public void setPolicies(List<Policy> policies) {
            this.policies = policies;
        }

        public List<Image> getImages() {
            return images;
        }

        public void setImages(List<Image> images) {
            this.images = images;
        }

        public List<CustomerReview> getCustomerReview() {
            return customerReview;
        }

        public void setCustomerReview(List<CustomerReview> customerReview) {
            this.customerReview = customerReview;
        }

        public Object getDresscode() {
            return dresscode;
        }

        public void setDresscode(Object dresscode) {
            this.dresscode = dresscode;
        }

        public Object getVanueType() {
            return vanueType;
        }

        public void setVanueType(Object vanueType) {
            this.vanueType = vanueType;
        }

        public List<RestaurantPropertySeatType> getRestaurantPropertySeatType() {
            return restaurantPropertySeatType;
        }

        public void setRestaurantPropertySeatType(List<RestaurantPropertySeatType> restaurantPropertySeatType) {
            this.restaurantPropertySeatType = restaurantPropertySeatType;
        }

        public List<RestaurantPropertyFoodType> getRestaurantPropertyFoodType() {
            return restaurantPropertyFoodType;
        }

        public void setRestaurantPropertyFoodType(List<RestaurantPropertyFoodType> restaurantPropertyFoodType) {
            this.restaurantPropertyFoodType = restaurantPropertyFoodType;
        }

        public List<RestaurantPropertyDinnerType> getRestaurantPropertyDinnerType() {
            return restaurantPropertyDinnerType;
        }

        public void setRestaurantPropertyDinnerType(List<RestaurantPropertyDinnerType> restaurantPropertyDinnerType) {
            this.restaurantPropertyDinnerType = restaurantPropertyDinnerType;
        }

        public List<RestaurantPropertyAmenity> getRestaurantPropertyAmenities() {
            return restaurantPropertyAmenities;
        }

        public void setRestaurantPropertyAmenities(List<RestaurantPropertyAmenity> restaurantPropertyAmenities) {
            this.restaurantPropertyAmenities = restaurantPropertyAmenities;
        }

        public List<RestaurantWeekday> getRestaurantWeekdays() {
            return restaurantWeekdays;
        }

        public void setRestaurantWeekdays(List<RestaurantWeekday> restaurantWeekdays) {
            this.restaurantWeekdays = restaurantWeekdays;
        }

        public List<RestoPropertyPrice> getRestoPropertyPrice() {
            return restoPropertyPrice;
        }

        public void setRestoPropertyPrice(List<RestoPropertyPrice> restoPropertyPrice) {
            this.restoPropertyPrice = restoPropertyPrice;
        }

        public List<Restotype> getRestotype() {
            return restotype;
        }

        public void setRestotype(List<Restotype> restotype) {
            this.restotype = restotype;
        }
    }

    public class Image {
        private Integer id;
        private String image;
        private Integer propertyId;
        private String url;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Integer getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(Integer propertyId) {
            this.propertyId = propertyId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public class ModifiedWeekday {
        private String day;
        private String opensAt;
        private String closesAt;

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getOpensAt() {
            return opensAt;
        }

        public void setOpensAt(String opensAt) {
            this.opensAt = opensAt;
        }

        public String getClosesAt() {
            return closesAt;
        }

        public void setClosesAt(String closesAt) {
            this.closesAt = closesAt;
        }
    }

    public class Policy {
        private Integer id;
        private String policy;
        private String propertyId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPolicy() {
            return policy;
        }

        public void setPolicy(String policy) {
            this.policy = policy;
        }

        public String getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(String propertyId) {
            this.propertyId = propertyId;
        }
    }

    public class Price {
        private Integer id;
        private String digit;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDigit() {
            return digit;
        }

        public void setDigit(String digit) {
            this.digit = digit;
        }
    }

    public class PropertyBookingTimeSlot {
        private String timeSlot;

        public String getTimeSlot() {
            return timeSlot;
        }

        public void setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
        }
    }

    public class RestaurantPropertyAmenity {
        private Integer id;
        private Integer amenitieId;
        private Integer restaurantPropertyId;
        private Amenety amenety;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getAmenitieId() {
            return amenitieId;
        }

        public void setAmenitieId(Integer amenitieId) {
            this.amenitieId = amenitieId;
        }

        public Integer getRestaurantPropertyId() {
            return restaurantPropertyId;
        }

        public void setRestaurantPropertyId(Integer restaurantPropertyId) {
            this.restaurantPropertyId = restaurantPropertyId;
        }

        public Amenety getAmenety() {
            return amenety;
        }

        public void setAmenety(Amenety amenety) {
            this.amenety = amenety;
        }
    }

    public class RestaurantPropertyDinnerType {
        private Integer id;
        private Integer restaurantPropertyId;
        private Integer dinnerTypeId;
        private String status;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getRestaurantPropertyId() {
            return restaurantPropertyId;
        }

        public void setRestaurantPropertyId(Integer restaurantPropertyId) {
            this.restaurantPropertyId = restaurantPropertyId;
        }

        public Integer getDinnerTypeId() {
            return dinnerTypeId;
        }

        public void setDinnerTypeId(Integer dinnerTypeId) {
            this.dinnerTypeId = dinnerTypeId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public class RestaurantPropertyFoodType {
        private Integer id;
        private Integer restaurantPropertyId;
        private Integer foodTypeId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getRestaurantPropertyId() {
            return restaurantPropertyId;
        }

        public void setRestaurantPropertyId(Integer restaurantPropertyId) {
            this.restaurantPropertyId = restaurantPropertyId;
        }

        public Integer getFoodTypeId() {
            return foodTypeId;
        }

        public void setFoodTypeId(Integer foodTypeId) {
            this.foodTypeId = foodTypeId;
        }
    }

    public class RestaurantPropertySeatType {
        private Integer id;
        private Integer restaurantPropertyId;
        private Integer seatTypeId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getRestaurantPropertyId() {
            return restaurantPropertyId;
        }

        public void setRestaurantPropertyId(Integer restaurantPropertyId) {
            this.restaurantPropertyId = restaurantPropertyId;
        }

        public Integer getSeatTypeId() {
            return seatTypeId;
        }

        public void setSeatTypeId(Integer seatTypeId) {
            this.seatTypeId = seatTypeId;
        }
    }

    public class RestaurantWeekday {
        private Integer id;
        private Integer propertyId;
        private String day;
        private Integer itemNumber;
        private Integer status;
        private String opensAt;
        private String closesAt;
        private Object open;
        private Object close;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(Integer propertyId) {
            this.propertyId = propertyId;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public Integer getItemNumber() {
            return itemNumber;
        }

        public void setItemNumber(Integer itemNumber) {
            this.itemNumber = itemNumber;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getOpensAt() {
            return opensAt;
        }

        public void setOpensAt(String opensAt) {
            this.opensAt = opensAt;
        }

        public String getClosesAt() {
            return closesAt;
        }

        public void setClosesAt(String closesAt) {
            this.closesAt = closesAt;
        }

        public Object getOpen() {
            return open;
        }

        public void setOpen(Object open) {
            this.open = open;
        }

        public Object getClose() {
            return close;
        }

        public void setClose(Object close) {
            this.close = close;
        }
    }

    public class Restaurants {
        private Integer currentPage;
        private List<Datum> data = new ArrayList<Datum>();
        private String firstPageUrl;
        private Integer from;
        private Integer lastPage;
        private String lastPageUrl;
        private String nextPageUrl;
        private String path;
        private Integer perPage;
        private Object prevPageUrl;
        private Integer to;
        private Integer total;

        public Integer getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
        }

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

        public String getFirstPageUrl() {
            return firstPageUrl;
        }

        public void setFirstPageUrl(String firstPageUrl) {
            this.firstPageUrl = firstPageUrl;
        }

        public Integer getFrom() {
            return from;
        }

        public void setFrom(Integer from) {
            this.from = from;
        }

        public Integer getLastPage() {
            return lastPage;
        }

        public void setLastPage(Integer lastPage) {
            this.lastPage = lastPage;
        }

        public String getLastPageUrl() {
            return lastPageUrl;
        }

        public void setLastPageUrl(String lastPageUrl) {
            this.lastPageUrl = lastPageUrl;
        }

        public String getNextPageUrl() {
            return nextPageUrl;
        }

        public void setNextPageUrl(String nextPageUrl) {
            this.nextPageUrl = nextPageUrl;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Integer getPerPage() {
            return perPage;
        }

        public void setPerPage(Integer perPage) {
            this.perPage = perPage;
        }

        public Object getPrevPageUrl() {
            return prevPageUrl;
        }

        public void setPrevPageUrl(Object prevPageUrl) {
            this.prevPageUrl = prevPageUrl;
        }

        public Integer getTo() {
            return to;
        }

        public void setTo(Integer to) {
            this.to = to;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }
    }

    public class RestoPropertyPrice {
        private Integer id;
        private Integer propertyId;
        private Integer pricesId;
        private String created;
        private Price price;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(Integer propertyId) {
            this.propertyId = propertyId;
        }

        public Integer getPricesId() {
            return pricesId;
        }

        public void setPricesId(Integer pricesId) {
            this.pricesId = pricesId;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public Price getPrice() {
            return price;
        }

        public void setPrice(Price price) {
            this.price = price;
        }
    }

    public class RestoType {
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Restotype {
        private Integer id;
        private Integer propertyId;
        private Integer typeId;
        private String created;
        private RestoType restoType;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(Integer propertyId) {
            this.propertyId = propertyId;
        }

        public Integer getTypeId() {
            return typeId;
        }

        public void setTypeId(Integer typeId) {
            this.typeId = typeId;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public RestoType getRestoType() {
            return restoType;
        }

        public void setRestoType(RestoType restoType) {
            this.restoType = restoType;
        }
    }

}
