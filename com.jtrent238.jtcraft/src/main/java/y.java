/*     */ import com.google.common.primitives.Doubles;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class y
/*     */   implements aa
/*     */ {
/*     */   private static x a;
/*     */   
/*     */   public int a()
/*     */   {
/*  27 */     return 4;
/*     */   }
/*     */   
/*     */   public List b()
/*     */   {
/*  32 */     return null;
/*     */   }
/*     */   
/*     */   public boolean a(ac paramac)
/*     */   {
/*  37 */     return paramac.a(a(), c());
/*     */   }
/*     */   
/*     */   public List a(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  42 */     return null;
/*     */   }
/*     */   
/*     */   public static int a(ac paramac, String paramString) {
/*     */     try {
/*  47 */       return Integer.parseInt(paramString);
/*     */     } catch (NumberFormatException localNumberFormatException) {
/*  49 */       throw new ce("commands.generic.num.invalid", new Object[] { paramString });
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(ac paramac, String paramString, int paramInt) {
/*  54 */     return a(paramac, paramString, paramInt, Integer.MAX_VALUE);
/*     */   }
/*     */   
/*     */   public static int a(ac paramac, String paramString, int paramInt1, int paramInt2) {
/*  58 */     int i = a(paramac, paramString);
/*     */     
/*  60 */     if (i < paramInt1)
/*  61 */       throw new ce("commands.generic.num.tooSmall", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
/*  62 */     if (i > paramInt2) {
/*  63 */       throw new ce("commands.generic.num.tooBig", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
/*     */     }
/*     */     
/*  66 */     return i;
/*     */   }
/*     */   
/*     */   public static double b(ac paramac, String paramString) {
/*     */     try {
/*  71 */       double d = Double.parseDouble(paramString);
/*  72 */       if (!Doubles.isFinite(d)) throw new ce("commands.generic.num.invalid", new Object[] { paramString });
/*  73 */       return d;
/*     */     } catch (NumberFormatException localNumberFormatException) {
/*  75 */       throw new ce("commands.generic.num.invalid", new Object[] { paramString });
/*     */     }
/*     */   }
/*     */   
/*     */   public static double a(ac paramac, String paramString, double paramDouble) {
/*  80 */     return a(paramac, paramString, paramDouble, Double.MAX_VALUE);
/*     */   }
/*     */   
/*     */   public static double a(ac paramac, String paramString, double paramDouble1, double paramDouble2) {
/*  84 */     double d = b(paramac, paramString);
/*     */     
/*  86 */     if (d < paramDouble1)
/*  87 */       throw new ce("commands.generic.double.tooSmall", new Object[] { Double.valueOf(d), Double.valueOf(paramDouble1) });
/*  88 */     if (d > paramDouble2) {
/*  89 */       throw new ce("commands.generic.double.tooBig", new Object[] { Double.valueOf(d), Double.valueOf(paramDouble2) });
/*     */     }
/*     */     
/*  92 */     return d;
/*     */   }
/*     */   
/*     */   public static boolean c(ac paramac, String paramString) {
/*  96 */     if ((paramString.equals("true")) || (paramString.equals("1")))
/*  97 */       return true;
/*  98 */     if ((paramString.equals("false")) || (paramString.equals("0"))) {
/*  99 */       return false;
/*     */     }
/* 101 */     throw new cd("commands.generic.boolean.invalid", new Object[] { paramString });
/*     */   }
/*     */   
/*     */   public static mw b(ac paramac)
/*     */   {
/* 106 */     if ((paramac instanceof mw)) {
/* 107 */       return (mw)paramac;
/*     */     }
/* 109 */     throw new cg("You must specify which player you wish to perform this action on.", new Object[0]);
/*     */   }
/*     */   
/*     */   public static mw d(ac paramac, String paramString)
/*     */   {
/* 114 */     mw localmw = ad.a(paramac, paramString);
/* 115 */     if (localmw != null) { return localmw;
/*     */     }
/* 117 */     localmw = MinecraftServer.I().ah().a(paramString);
/*     */     
/* 119 */     if (localmw == null) {
/* 120 */       throw new cg();
/*     */     }
/* 122 */     return localmw;
/*     */   }
/*     */   
/*     */   public static String e(ac paramac, String paramString)
/*     */   {
/* 127 */     mw localmw = ad.a(paramac, paramString);
/*     */     
/* 129 */     if (localmw != null)
/* 130 */       return localmw.b_();
/* 131 */     if (ad.b(paramString)) {
/* 132 */       throw new cg();
/*     */     }
/*     */     
/* 135 */     return paramString;
/*     */   }
/*     */   
/*     */   public static fj a(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 139 */     return a(paramac, paramArrayOfString, paramInt, false);
/*     */   }
/*     */   
/*     */   public static fj a(ac paramac, String[] paramArrayOfString, int paramInt, boolean paramBoolean) {
/* 143 */     fq localfq = new fq("");
/*     */     
/* 145 */     for (int i = paramInt; i < paramArrayOfString.length; i++) {
/* 146 */       if (i > paramInt) localfq.a(" ");
/* 147 */       Object localObject = new fq(paramArrayOfString[i]);
/*     */       
/* 149 */       if (paramBoolean) {
/* 150 */         fj localfj = ad.b(paramac, paramArrayOfString[i]);
/*     */         
/* 152 */         if (localfj != null) {
/* 153 */           localObject = localfj;
/* 154 */         } else if (ad.b(paramArrayOfString[i])) {
/* 155 */           throw new cg();
/*     */         }
/*     */       }
/*     */       
/* 159 */       localfq.a((fj)localObject);
/*     */     }
/*     */     
/* 162 */     return localfq;
/*     */   }
/*     */   
/*     */   public static String b(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 166 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/* 168 */     for (int i = paramInt; i < paramArrayOfString.length; i++) {
/* 169 */       if (i > paramInt) localStringBuilder.append(" ");
/* 170 */       String str = paramArrayOfString[i];
/*     */       
/* 172 */       localStringBuilder.append(str);
/*     */     }
/*     */     
/* 175 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   public static double a(ac paramac, double paramDouble, String paramString) {
/* 179 */     return a(paramac, paramDouble, paramString, -30000000, 30000000);
/*     */   }
/*     */   
/*     */   public static double a(ac paramac, double paramDouble, String paramString, int paramInt1, int paramInt2) {
/* 183 */     boolean bool1 = paramString.startsWith("~");
/* 184 */     if ((bool1) && (Double.isNaN(paramDouble))) throw new ce("commands.generic.num.invalid", new Object[] { Double.valueOf(paramDouble) });
/* 185 */     double d = bool1 ? paramDouble : 0.0D;
/*     */     
/* 187 */     if ((!bool1) || (paramString.length() > 1)) {
/* 188 */       boolean bool2 = paramString.contains(".");
/* 189 */       if (bool1) { paramString = paramString.substring(1);
/*     */       }
/* 191 */       d += b(paramac, paramString);
/*     */       
/* 193 */       if ((!bool2) && (!bool1)) {
/* 194 */         d += 0.5D;
/*     */       }
/*     */     }
/*     */     
/* 198 */     if ((paramInt1 != 0) || (paramInt2 != 0)) {
/* 199 */       if (d < paramInt1)
/* 200 */         throw new ce("commands.generic.double.tooSmall", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt1) });
/* 201 */       if (d > paramInt2) {
/* 202 */         throw new ce("commands.generic.double.tooBig", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt2) });
/*     */       }
/*     */     }
/*     */     
/* 206 */     return d;
/*     */   }
/*     */   
/*     */   public static adb f(ac paramac, String paramString) {
/* 210 */     Object localObject = (adb)adb.e.a(paramString);
/*     */     
/* 212 */     if (localObject == null) {
/*     */       try {
/* 214 */         adb localadb = adb.d(Integer.parseInt(paramString));
/*     */         
/* 216 */         if (localadb != null) {
/* 217 */           fr localfr = new fr("commands.generic.deprecatedId", new Object[] { adb.e.c(localadb) });
/* 218 */           localfr.b().a(a.h);
/* 219 */           paramac.a(localfr);
/*     */         }
/*     */         
/* 222 */         localObject = localadb;
/*     */       }
/*     */       catch (NumberFormatException localNumberFormatException) {}
/*     */     }
/*     */     
/* 227 */     if (localObject == null) {
/* 228 */       throw new ce("commands.give.notFound", new Object[] { paramString });
/*     */     }
/*     */     
/* 231 */     return (adb)localObject;
/*     */   }
/*     */   
/*     */   public static aji g(ac paramac, String paramString) {
/* 235 */     if (aji.c.b(paramString)) {
/* 236 */       return (aji)aji.c.a(paramString);
/*     */     }
/*     */     try
/*     */     {
/* 240 */       int i = Integer.parseInt(paramString);
/*     */       
/* 242 */       if (aji.c.b(i)) {
/* 243 */         aji localaji = aji.e(i);
/*     */         
/* 245 */         fr localfr = new fr("commands.generic.deprecatedId", new Object[] { aji.c.c(localaji) });
/* 246 */         localfr.b().a(a.h);
/* 247 */         paramac.a(localfr);
/*     */         
/* 249 */         return localaji;
/*     */       }
/*     */     }
/*     */     catch (NumberFormatException localNumberFormatException) {}
/*     */     
/* 254 */     throw new ce("commands.give.notFound", new Object[] { paramString });
/*     */   }
/*     */   
/*     */   public static String a(Object[] paramArrayOfObject) {
/* 258 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/* 260 */     for (int i = 0; i < paramArrayOfObject.length; i++) {
/* 261 */       String str = paramArrayOfObject[i].toString();
/*     */       
/* 263 */       if (i > 0) {
/* 264 */         if (i == paramArrayOfObject.length - 1) {
/* 265 */           localStringBuilder.append(" and ");
/*     */         } else {
/* 267 */           localStringBuilder.append(", ");
/*     */         }
/*     */       }
/*     */       
/* 271 */       localStringBuilder.append(str);
/*     */     }
/*     */     
/* 274 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   public static fj a(fj[] paramArrayOffj) {
/* 278 */     fq localfq = new fq("");
/*     */     
/* 280 */     for (int i = 0; i < paramArrayOffj.length; i++) {
/* 281 */       if (i > 0) {
/* 282 */         if (i == paramArrayOffj.length - 1) {
/* 283 */           localfq.a(" and ");
/* 284 */         } else if (i > 0) {
/* 285 */           localfq.a(", ");
/*     */         }
/*     */       }
/*     */       
/* 289 */       localfq.a(paramArrayOffj[i]);
/*     */     }
/*     */     
/* 292 */     return localfq;
/*     */   }
/*     */   
/*     */   public static String a(Collection paramCollection) {
/* 296 */     return a(paramCollection.toArray(new String[paramCollection.size()]));
/*     */   }
/*     */   
/*     */   public static boolean a(String paramString1, String paramString2) {
/* 300 */     return paramString2.regionMatches(true, 0, paramString1, 0, paramString1.length());
/*     */   }
/*     */   
/*     */   public static List a(String[] paramArrayOfString1, String... paramVarArgs) {
/* 304 */     String str1 = paramArrayOfString1[(paramArrayOfString1.length - 1)];
/* 305 */     ArrayList localArrayList = new ArrayList();
/*     */     
/* 307 */     for (String str2 : paramVarArgs) {
/* 308 */       if (a(str1, str2)) {
/* 309 */         localArrayList.add(str2);
/*     */       }
/*     */     }
/*     */     
/* 313 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public static List a(String[] paramArrayOfString, Iterable paramIterable) {
/* 317 */     String str1 = paramArrayOfString[(paramArrayOfString.length - 1)];
/* 318 */     ArrayList localArrayList = new ArrayList();
/*     */     
/* 320 */     for (String str2 : paramIterable) {
/* 321 */       if (a(str1, str2)) {
/* 322 */         localArrayList.add(str2);
/*     */       }
/*     */     }
/*     */     
/* 326 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public boolean a(String[] paramArrayOfString, int paramInt)
/*     */   {
/* 331 */     return false;
/*     */   }
/*     */   
/*     */   public static void a(ac paramac, aa paramaa, String paramString, Object... paramVarArgs) {
/* 335 */     a(paramac, paramaa, 0, paramString, paramVarArgs);
/*     */   }
/*     */   
/*     */   public static void a(ac paramac, aa paramaa, int paramInt, String paramString, Object... paramVarArgs) {
/* 339 */     if (a != null) {
/* 340 */       a.a(paramac, paramaa, paramInt, paramString, paramVarArgs);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(x paramx) {
/* 345 */     a = paramx;
/*     */   }
/*     */   
/*     */   public int a(aa paramaa)
/*     */   {
/* 350 */     return c().compareTo(paramaa.c());
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */