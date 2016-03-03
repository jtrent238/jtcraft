/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class dh
/*     */   extends dy
/*     */ {
/*  14 */   private static final Logger b = ;
/*     */   
/*  16 */   private Map c = new HashMap();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void a(DataOutput paramDataOutput)
/*     */   {
/*  23 */     for (String str : this.c.keySet()) {
/*  24 */       dy localdy = (dy)this.c.get(str);
/*  25 */       a(str, localdy, paramDataOutput);
/*     */     }
/*  27 */     paramDataOutput.writeByte(0);
/*     */   }
/*     */   
/*     */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*     */   {
/*  32 */     if (paramInt > 512) {
/*  33 */       throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*     */     }
/*  35 */     this.c.clear();
/*     */     byte b1;
/*  37 */     while ((b1 = a(paramDataInput, paramds)) != 0) {
/*  38 */       String str = b(paramDataInput, paramds);
/*     */       
/*  40 */       paramds.a(16 * str.length());
/*  41 */       dy localdy = a(b1, str, paramDataInput, paramInt + 1, paramds);
/*  42 */       this.c.put(str, localdy);
/*     */     }
/*     */   }
/*     */   
/*     */   public Set c() {
/*  47 */     return this.c.keySet();
/*     */   }
/*     */   
/*     */   public byte a()
/*     */   {
/*  52 */     return 10;
/*     */   }
/*     */   
/*     */   public void a(String paramString, dy paramdy) {
/*  56 */     this.c.put(paramString, paramdy);
/*     */   }
/*     */   
/*     */   public void a(String paramString, byte paramByte) {
/*  60 */     this.c.put(paramString, new dg(paramByte));
/*     */   }
/*     */   
/*     */   public void a(String paramString, short paramShort) {
/*  64 */     this.c.put(paramString, new dw(paramShort));
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt) {
/*  68 */     this.c.put(paramString, new dp(paramInt));
/*     */   }
/*     */   
/*     */   public void a(String paramString, long paramLong) {
/*  72 */     this.c.put(paramString, new dr(paramLong));
/*     */   }
/*     */   
/*     */   public void a(String paramString, float paramFloat) {
/*  76 */     this.c.put(paramString, new dm(paramFloat));
/*     */   }
/*     */   
/*     */   public void a(String paramString, double paramDouble) {
/*  80 */     this.c.put(paramString, new dk(paramDouble));
/*     */   }
/*     */   
/*     */   public void a(String paramString1, String paramString2) {
/*  84 */     this.c.put(paramString1, new dx(paramString2));
/*     */   }
/*     */   
/*     */   public void a(String paramString, byte[] paramArrayOfByte) {
/*  88 */     this.c.put(paramString, new df(paramArrayOfByte));
/*     */   }
/*     */   
/*     */   public void a(String paramString, int[] paramArrayOfInt) {
/*  92 */     this.c.put(paramString, new dn(paramArrayOfInt));
/*     */   }
/*     */   
/*     */   public void a(String paramString, boolean paramBoolean) {
/*  96 */     a(paramString, (byte)(paramBoolean ? 1 : 0));
/*     */   }
/*     */   
/*     */   public dy a(String paramString) {
/* 100 */     return (dy)this.c.get(paramString);
/*     */   }
/*     */   
/*     */   public byte b(String paramString) {
/* 104 */     dy localdy = (dy)this.c.get(paramString);
/* 105 */     if (localdy != null) {
/* 106 */       return localdy.a();
/*     */     }
/* 108 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean c(String paramString) {
/* 112 */     return this.c.containsKey(paramString);
/*     */   }
/*     */   
/*     */   public boolean b(String paramString, int paramInt) {
/* 116 */     int i = b(paramString);
/* 117 */     if (i == paramInt) {
/* 118 */       return true;
/*     */     }
/* 120 */     if (paramInt == 99) {
/* 121 */       return (i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 6);
/*     */     }
/*     */     
/* 124 */     return false;
/*     */   }
/*     */   
/*     */   public byte d(String paramString) {
/*     */     try {
/* 129 */       if (!this.c.containsKey(paramString)) return 0;
/* 130 */       return ((dz)this.c.get(paramString)).f();
/*     */     } catch (ClassCastException localClassCastException) {}
/* 132 */     return 0;
/*     */   }
/*     */   
/*     */   public short e(String paramString)
/*     */   {
/*     */     try {
/* 138 */       if (!this.c.containsKey(paramString)) return 0;
/* 139 */       return ((dz)this.c.get(paramString)).e();
/*     */     } catch (ClassCastException localClassCastException) {}
/* 141 */     return 0;
/*     */   }
/*     */   
/*     */   public int f(String paramString)
/*     */   {
/*     */     try {
/* 147 */       if (!this.c.containsKey(paramString)) return 0;
/* 148 */       return ((dz)this.c.get(paramString)).d();
/*     */     } catch (ClassCastException localClassCastException) {}
/* 150 */     return 0;
/*     */   }
/*     */   
/*     */   public long g(String paramString)
/*     */   {
/*     */     try {
/* 156 */       if (!this.c.containsKey(paramString)) return 0L;
/* 157 */       return ((dz)this.c.get(paramString)).c();
/*     */     } catch (ClassCastException localClassCastException) {}
/* 159 */     return 0L;
/*     */   }
/*     */   
/*     */   public float h(String paramString)
/*     */   {
/*     */     try {
/* 165 */       if (!this.c.containsKey(paramString)) return 0.0F;
/* 166 */       return ((dz)this.c.get(paramString)).h();
/*     */     } catch (ClassCastException localClassCastException) {}
/* 168 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public double i(String paramString)
/*     */   {
/*     */     try {
/* 174 */       if (!this.c.containsKey(paramString)) return 0.0D;
/* 175 */       return ((dz)this.c.get(paramString)).g();
/*     */     } catch (ClassCastException localClassCastException) {}
/* 177 */     return 0.0D;
/*     */   }
/*     */   
/*     */   public String j(String paramString)
/*     */   {
/*     */     try {
/* 183 */       if (!this.c.containsKey(paramString)) return "";
/* 184 */       return ((dy)this.c.get(paramString)).a_();
/*     */     } catch (ClassCastException localClassCastException) {}
/* 186 */     return "";
/*     */   }
/*     */   
/*     */   public byte[] k(String paramString)
/*     */   {
/*     */     try {
/* 192 */       if (!this.c.containsKey(paramString)) return new byte[0];
/* 193 */       return ((df)this.c.get(paramString)).c();
/*     */     } catch (ClassCastException localClassCastException) {
/* 195 */       throw new s(a(paramString, 7, localClassCastException));
/*     */     }
/*     */   }
/*     */   
/*     */   public int[] l(String paramString) {
/*     */     try {
/* 201 */       if (!this.c.containsKey(paramString)) return new int[0];
/* 202 */       return ((dn)this.c.get(paramString)).c();
/*     */     } catch (ClassCastException localClassCastException) {
/* 204 */       throw new s(a(paramString, 11, localClassCastException));
/*     */     }
/*     */   }
/*     */   
/*     */   public dh m(String paramString) {
/*     */     try {
/* 210 */       if (!this.c.containsKey(paramString)) return new dh();
/* 211 */       return (dh)this.c.get(paramString);
/*     */     } catch (ClassCastException localClassCastException) {
/* 213 */       throw new s(a(paramString, 10, localClassCastException));
/*     */     }
/*     */   }
/*     */   
/*     */   public dq c(String paramString, int paramInt) {
/*     */     try {
/* 219 */       if (b(paramString) != 9) return new dq();
/* 220 */       dq localdq = (dq)this.c.get(paramString);
/* 221 */       if ((localdq.c() > 0) && (localdq.d() != paramInt)) {
/* 222 */         return new dq();
/*     */       }
/* 224 */       return localdq;
/*     */     } catch (ClassCastException localClassCastException) {
/* 226 */       throw new s(a(paramString, 9, localClassCastException));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean n(String paramString) {
/* 231 */     return d(paramString) != 0;
/*     */   }
/*     */   
/*     */   public void o(String paramString) {
/* 235 */     this.c.remove(paramString);
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 240 */     String str1 = "{";
/* 241 */     for (String str2 : this.c.keySet()) {
/* 242 */       str1 = str1 + str2 + ':' + this.c.get(str2) + ',';
/*     */     }
/* 244 */     return str1 + "}";
/*     */   }
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
/*     */   public boolean d()
/*     */   {
/* 261 */     return this.c.isEmpty();
/*     */   }
/*     */   
/*     */   private b a(String paramString, int paramInt, ClassCastException paramClassCastException) {
/* 265 */     b localb = b.a(paramClassCastException, "Reading NBT data");
/* 266 */     k localk = localb.a("Corrupt NBT tag", 1);
/*     */     
/* 268 */     localk.a("Tag type found", new di(this, paramString));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */     localk.a("Tag type expected", new dj(this, paramInt));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */     localk.a("Tag name", paramString);
/*     */     
/* 282 */     return localb;
/*     */   }
/*     */   
/*     */   public dy b()
/*     */   {
/* 287 */     dh localdh = new dh();
/* 288 */     for (String str : this.c.keySet()) {
/* 289 */       localdh.a(str, ((dy)this.c.get(str)).b());
/*     */     }
/* 291 */     return localdh;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 296 */     if (super.equals(paramObject)) {
/* 297 */       dh localdh = (dh)paramObject;
/* 298 */       return this.c.entrySet().equals(localdh.c.entrySet());
/*     */     }
/* 300 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 305 */     return super.hashCode() ^ this.c.hashCode();
/*     */   }
/*     */   
/*     */   private static void a(String paramString, dy paramdy, DataOutput paramDataOutput) {
/* 309 */     paramDataOutput.writeByte(paramdy.a());
/* 310 */     if (paramdy.a() == 0) { return;
/*     */     }
/* 312 */     paramDataOutput.writeUTF(paramString);
/*     */     
/* 314 */     paramdy.a(paramDataOutput);
/*     */   }
/*     */   
/*     */   private static byte a(DataInput paramDataInput, ds paramds) {
/* 318 */     return paramDataInput.readByte();
/*     */   }
/*     */   
/*     */   private static String b(DataInput paramDataInput, ds paramds) {
/* 322 */     return paramDataInput.readUTF();
/*     */   }
/*     */   
/*     */   static dy a(byte paramByte, String paramString, DataInput paramDataInput, int paramInt, ds paramds) {
/* 326 */     dy localdy = dy.a(paramByte);
/*     */     try
/*     */     {
/* 329 */       localdy.a(paramDataInput, paramInt, paramds);
/*     */     } catch (IOException localIOException) {
/* 331 */       b localb = b.a(localIOException, "Loading NBT data");
/* 332 */       k localk = localb.a("NBT Tag");
/* 333 */       localk.a("Tag name", paramString);
/* 334 */       localk.a("Tag type", Byte.valueOf(paramByte));
/* 335 */       throw new s(localb);
/*     */     }
/*     */     
/* 338 */     return localdy;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */