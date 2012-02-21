package net.osmand.plus.activities;

import com.bidforfix.andorid.BidForFixActivity;
import com.bidforfix.andorid.BidForFixHelper;

public class OsmandBidForFixActivity extends BidForFixActivity {

	@Override
	public BidForFixHelper getBidForFixHelper() {
		return ((OsmandApplication) getApplication()).getBidForFix();
	}
}
