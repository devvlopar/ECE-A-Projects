class Auction {
    private String itemName;
    private double highestBid;
    private String highestBidder;

    public Auction(String itemName) {
        this.itemName = itemName;
        this.highestBid = 0.0;
        this.highestBidder = "No bids yet.";
    }

    public void placeBid(String bidder, double bidAmount) {
        if (bidAmount > highestBid) {
            highestBid = bidAmount;
            highestBidder = bidder;
            System.out.println("New highest bid: $" + bidAmount + " by " + bidder);
        } else {
            System.out.println("Bid too low! Current highest bid: $" + highestBid);
        }
    }

    public void displayHighestBid() {
        System.out.println("Item: " + itemName);
        System.out.println("Highest bid: $" + highestBid + " by " + highestBidder);
    }
}

