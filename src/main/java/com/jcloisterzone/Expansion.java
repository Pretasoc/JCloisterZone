package com.jcloisterzone;

import static com.jcloisterzone.ui.I18nUtils._;

import com.jcloisterzone.game.Capability;
import com.jcloisterzone.game.capability.AbbeyCapability;
import com.jcloisterzone.game.capability.BarnCapability;
import com.jcloisterzone.game.capability.BazaarCapability;
import com.jcloisterzone.game.capability.BigFollowerCapability;
import com.jcloisterzone.game.capability.BridgeCapability;
import com.jcloisterzone.game.capability.BuilderCapability;
import com.jcloisterzone.game.capability.CastleCapability;
import com.jcloisterzone.game.capability.CathedralCapability;
import com.jcloisterzone.game.capability.CornCircleCapability;
import com.jcloisterzone.game.capability.CountCapability;
import com.jcloisterzone.game.capability.DragonCapability;
import com.jcloisterzone.game.capability.FairyCapability;
import com.jcloisterzone.game.capability.FestivalCapability;
import com.jcloisterzone.game.capability.FlierCapability;
import com.jcloisterzone.game.capability.GermanMonasteriesCapability;
import com.jcloisterzone.game.capability.GoldminesCapability;
import com.jcloisterzone.game.capability.InnCapability;
import com.jcloisterzone.game.capability.KingAndRobberBaronCapability;
import com.jcloisterzone.game.capability.LittleBuildingsCapability;
import com.jcloisterzone.game.capability.MageAndWitchCapability;
import com.jcloisterzone.game.capability.MayorCapability;
import com.jcloisterzone.game.capability.PhantomCapability;
import com.jcloisterzone.game.capability.PigCapability;
import com.jcloisterzone.game.capability.PigHerdCapability;
import com.jcloisterzone.game.capability.PortalCapability;
import com.jcloisterzone.game.capability.PrincessCapability;
import com.jcloisterzone.game.capability.RiverCapability;
import com.jcloisterzone.game.capability.ShrineCapability;
import com.jcloisterzone.game.capability.SiegeCapability;
import com.jcloisterzone.game.capability.StandardGameCapability;
import com.jcloisterzone.game.capability.TowerCapability;
import com.jcloisterzone.game.capability.TradeGoodsCapability;
import com.jcloisterzone.game.capability.TunnelCapability;
import com.jcloisterzone.game.capability.WagonCapability;
import com.jcloisterzone.game.capability.WindRoseCapability;
import com.jcloisterzone.game.capability.YagaCapability;
import com.jcloisterzone.plugin.Plugin;

import io.vavr.collection.Vector;

@SuppressWarnings("unchecked")
/**
 * See https://boardgamegeek.com/wiki/page/Carcassonne_series
 */
public class Expansion {
    // Basic sets
    public static Expansion BASIC = new Expansion("BASIC", "BA", _("Basic game"),
            new Class[] { StandardGameCapability.class }, ExpansionType.BASIC);
    @NotImplemented public static Expansion WHEEL_OF_FORTUNE = new Expansion("WHEEL_OF_FORTUNE", "WF", _("Wheel of Fortune"), ExpansionType.BASIC);

    // Winter branch
    public static Expansion WINTER = new Expansion("WINTER", "WI", _("Winter Edition"), ExpansionType.BASIC_EXT);
    @NotImplemented public static Expansion GINGERBREAD_MAN = new Expansion("GINGERBREAD_MAN", "GM", _("The Gingerbread Man"), ExpansionType.MINOR);

    // Big expansions
    public static Expansion INNS_AND_CATHEDRALS = new Expansion("INNS_AND_CATHEDRALS", "IC", _("Inns & Cathedrals"),
            new Class[] { BigFollowerCapability.class, InnCapability.class, CathedralCapability.class}, ExpansionType.MAJOR);
    public static Expansion TRADERS_AND_BUILDERS = new Expansion("TRADERS_AND_BUILDERS", "TB", _("Traders & Builders"),
            new Class[] { PigCapability.class, BuilderCapability.class, TradeGoodsCapability.class, PigHerdCapability.class }, ExpansionType.MAJOR);
    public static Expansion PRINCESS_AND_DRAGON = new Expansion("PRINCESS_AND_DRAGON", "DG", _("The Princess & The Dragon"),
            new Class[] { FairyCapability.class, DragonCapability.class, PortalCapability.class, PrincessCapability.class }, ExpansionType.MAJOR);
    public static Expansion TOWER = new Expansion("TOWER", "TO", _("The Tower"),
            new Class[] { TowerCapability.class }, ExpansionType.MAJOR);
    public static Expansion ABBEY_AND_MAYOR = new Expansion("ABBEY_AND_MAYOR", "AM", _("Abbey & Mayor"),
            new Class[] { AbbeyCapability.class, WagonCapability.class, MayorCapability.class, BarnCapability.class }, ExpansionType.MAJOR);
    public static Expansion CATAPULT = new Expansion("CATAPULT", "CA", _("The Catapult"), ExpansionType.MAJOR);
    public static Expansion BRIDGES_CASTLES_AND_BAZAARS = new Expansion("BRIDGES_CASTLES_AND_BAZAARS", "BB", _("Bridges, Castles and Bazaars"),
            new Class[] { BridgeCapability.class, CastleCapability.class, BazaarCapability.class }, ExpansionType.MAJOR);
    @NotImplemented public static Expansion HILLS_AND_SHEEP = new Expansion("HILLS_AND_SHEEP", "HS", _("Hills and Sheep"), ExpansionType.MAJOR);
    @NotImplemented public static Expansion UNDER_THE_BIG_TOP = new Expansion("UNDER_THE_BIG_TOP", "UN", _("Under the Big Top"), ExpansionType.MAJOR);

    // Small expansion
    public static Expansion KING_AND_ROBBER_BARON = new Expansion("KING_AND_ROBBER_BARON", "KR", _("King and Robber Baron"), new Class[] { KingAndRobberBaronCapability.class }, ExpansionType.MINOR);
    public static Expansion RIVER = new Expansion("RIVER", "R1", _("The River"), new Class[] { RiverCapability.class }, ExpansionType.MINOR);
    public static Expansion RIVER_II = new Expansion("RIVER_II", "R2", _("The River II"), new Class[] { RiverCapability.class }, ExpansionType.MINOR);
    public static Expansion CATHARS = new Expansion("CATHARS", "SI", _("The Cathars / Siege"), new Class[] { SiegeCapability.class }, ExpansionType.MINOR);
    public static Expansion BESIEGERS = new Expansion("BESIEGERS", "BE", _("The Besiegers"), new Class[] { SiegeCapability.class }, ExpansionType.MINOR);
    public static Expansion COUNT = new Expansion("COUNT", "CO", _("The Count of Carcassonne"), new Class[] { CountCapability.class }, ExpansionType.MINOR);
    public static Expansion GQ11 = new Expansion("GQ11", "GQ", _("The Mini Expansion (GQ11)"), ExpansionType.MINOR);
    public static Expansion CULT = new Expansion("CULT", "CU", _("The Cult"),  new Class[] { ShrineCapability.class }, ExpansionType.MINOR);
    public static Expansion TUNNEL = new Expansion("TUNNEL", "TU", _("The Tunnel"), new Class[] { TunnelCapability.class }, ExpansionType.MINOR);
    public static Expansion CORN_CIRCLES = new Expansion("CORN_CIRCLES", "CC", _("The Corn Circles"), new Class[] { CornCircleCapability.class }, ExpansionType.MINOR);
    @NotImplemented public static Expansion PLAGUE = new Expansion("PLAGUE", "PL", _("The Plague"), ExpansionType.MINOR);
    public static Expansion PHANTOM = new Expansion("PHANTOM", "PH", _("The Phantom"),  new Class[] { PhantomCapability.class }, ExpansionType.MINOR);
    public static Expansion FESTIVAL = new Expansion("FESTIVAL", "FE", _("The Festival (10th an.)"), new Class[] { FestivalCapability.class }, ExpansionType.MINOR);
    public static Expansion LITTLE_BUILDINGS = new Expansion("LITTLE_BUILDINGS", "LB", _("Little Buildings"), new Class[] { LittleBuildingsCapability.class }, ExpansionType.MINOR);
    public static Expansion WIND_ROSE = new Expansion("WIND_ROSE", "WR", _("The Wind Rose"), new Class[] { WindRoseCapability.class }, ExpansionType.MINOR);
    public static Expansion GERMAN_MONASTERIES = new Expansion("GERMAN_MONASTERIES", "GM", _("The German Monasteries"), new Class[] { GermanMonasteriesCapability.class }, ExpansionType.MINOR);
    @NotImplemented public static Expansion CASTLES = new Expansion("CASTLES", "CA", _("Castles in Germany"), ExpansionType.MINOR);
    @NotImplemented public static Expansion HALFINGS_I = new Expansion("HALFINGS_I", "H1", _("Halfings") + " I", ExpansionType.MINOR);
    @NotImplemented public static Expansion HALFINGS_II = new Expansion("HALFINGS_II", "H2", _("Halfings") + " ÏI", ExpansionType.MINOR);
    @NotImplemented public static Expansion WATCHTOWER = new Expansion("WATCHTOWER", "WT", _("The Watchtower"), ExpansionType.MINOR);

    // Minis expansion line
    public static Expansion FLIER = new Expansion("FLIER", "FL", "#1 - " + _("The Flier"), new Class[] { FlierCapability.class }, ExpansionType.MINI);
    @NotImplemented public static Expansion MESSAGES = new Expansion("MESSAGES", "ME", "#2 - " + _("The Messages"), ExpansionType.MINI);
    @NotImplemented public static Expansion FERRIES = new Expansion("FERRIES", "FR", "#3 - " + _("The Ferries"), ExpansionType.MINI);
    public static Expansion GOLDMINES = new Expansion("GOLDMINES", "GO", "#4 - " + _("The Goldmines"), new Class[] { GoldminesCapability.class }, ExpansionType.MINI);
    public static Expansion MAGE_AND_WITCH = new Expansion("MAGE_AND_WITCH", "MW", "#5 - " + _("Mage & Witch"), new Class[] { MageAndWitchCapability.class }, ExpansionType.MINI);
    @NotImplemented public static Expansion ROBBERS = new Expansion("ROBBERS", "RO", "#6 - " + _("The Robbers"), ExpansionType.MINI);
    public static Expansion CORN_CIRCLES_II = new Expansion("CORN_CIRCLES_II", "C2", "#7 - " + _("The Corn Circles II"), new Class[] { CornCircleCapability.class }, ExpansionType.MINI);

    // Promo/one tile expansions
    @NotImplemented public static Expansion SCHOOL = new Expansion("SCHOOL", "SC", _("The School"), ExpansionType.PROMO);
    @NotImplemented public static Expansion LA_PORXADA = new Expansion("LA_PORXADA", "PX", _("La Porxada"), ExpansionType.PROMO);
    public static Expansion RUSSIAN_PROMOS = new Expansion("RUSSIAN_PROMOS", "RP", _("Russian Promos"), new Class[] { YagaCapability.class }, ExpansionType.PROMO);
    @NotImplemented public static Expansion DARMSTADT_PROMO = new Expansion("DARMSTADT_PROMO", "DP", _("Darmstadt Promo"), ExpansionType.PROMO);
    @NotImplemented public static Expansion LABYRINTH = new Expansion("LABYRINTH", "LA", _("Labyrinth"), ExpansionType.PROMO);

    private static Vector<Expansion> _values = Vector.of(
        BASIC, WINTER,
        INNS_AND_CATHEDRALS, TRADERS_AND_BUILDERS, PRINCESS_AND_DRAGON, TOWER,
        ABBEY_AND_MAYOR, BRIDGES_CASTLES_AND_BAZAARS,
        KING_AND_ROBBER_BARON, RIVER, RIVER_II, CATHARS, BESIEGERS, COUNT, GQ11, CULT, TUNNEL,
        CORN_CIRCLES, PHANTOM, FESTIVAL, LITTLE_BUILDINGS, WIND_ROSE, GERMAN_MONASTERIES,
        FLIER, GOLDMINES, MAGE_AND_WITCH, CORN_CIRCLES_II,
        RUSSIAN_PROMOS
    );

    private final String name;
    private final String code;
    private final String label;
    private final Class<? extends Capability<?>>[] capabilities;
    private final ExpansionType type;
    private Plugin origin;

    public Expansion(String name, String code, String label, ExpansionType type) {
        this(name, code, label, null, type);
    }

    public Expansion(String name, String code, String label, Class<? extends Capability<?>>[] capabilities,
            ExpansionType type) {
        this.name = name;
        this.code = code;
        this.label = label;
        this.capabilities = capabilities == null ? new Class[0] : capabilities;
        this.type = type;
    }

    /** Returns all implemented expansion */
    public static Vector<Expansion> values() {
        return _values;
    }

    public String name() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public ExpansionType getType() {
        return type;
    }

    public Plugin getOrigin() {
        return origin;
    }

    public Class<? extends Capability<?>>[] getCapabilities() {
        return capabilities;
    }

    @Override
    public String toString() {
        return label;
    }

    public static Expansion valueOf(String name) {
        for (Expansion exp : values()) {
            if (exp.name.equals(name)) return exp;
        }
        throw new IllegalArgumentException("Expansion " + name + " doesn't exist.");
    }

    public static Expansion valueOfCode(String code) {
        for (Expansion exp : values()) {
            if (exp.code.equals(code)) return exp;
        }
        throw new IllegalArgumentException("Expansion " + code + " doesn't exist.");
    }

    public static void register(Expansion exp, Plugin origin) {
        exp.origin = origin;
        _values = _values.append(exp);
    }

    public static void unregister(Expansion exp) {
        _values = _values.remove(exp);
    }
}
