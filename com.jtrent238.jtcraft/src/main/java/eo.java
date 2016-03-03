/*     */ import com.google.common.collect.BiMap;
/*     */ import com.google.common.collect.HashBiMap;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Maps;
/*     */ import gnu.trove.map.TIntObjectMap;
/*     */ import gnu.trove.map.hash.TIntObjectHashMap;
/*     */ import java.util.Map;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum eo
/*     */ {
/*     */   private static final TIntObjectMap e;
/*     */   private static final Map f;
/*     */   private final int g;
/* 135 */   private final BiMap h = HashBiMap.create();
/* 136 */   private final BiMap i = HashBiMap.create();
/*     */   
/*     */ 
/* 139 */   private eo(int paramInt1) { this.g = paramInt1; }
/*     */   
/*     */   protected eo a(int paramInt, Class paramClass) {
/*     */     String str;
/* 143 */     if (this.h.containsKey(Integer.valueOf(paramInt))) {
/* 144 */       str = "Serverbound packet ID " + paramInt + " is already assigned to " + this.h.get(Integer.valueOf(paramInt)) + "; cannot re-assign to " + paramClass;
/* 145 */       LogManager.getLogger().fatal(str);
/* 146 */       throw new IllegalArgumentException(str);
/*     */     }
/* 148 */     if (this.h.containsValue(paramClass)) {
/* 149 */       str = "Serverbound packet " + paramClass + " is already assigned to ID " + this.h.inverse().get(paramClass) + "; cannot re-assign to " + paramInt;
/* 150 */       LogManager.getLogger().fatal(str);
/* 151 */       throw new IllegalArgumentException(str);
/*     */     }
/* 153 */     this.h.put(Integer.valueOf(paramInt), paramClass);
/* 154 */     return this;
/*     */   }
/*     */   
/*     */   protected eo b(int paramInt, Class paramClass) { String str;
/* 158 */     if (this.i.containsKey(Integer.valueOf(paramInt))) {
/* 159 */       str = "Clientbound packet ID " + paramInt + " is already assigned to " + this.i.get(Integer.valueOf(paramInt)) + "; cannot re-assign to " + paramClass;
/* 160 */       LogManager.getLogger().fatal(str);
/* 161 */       throw new IllegalArgumentException(str);
/*     */     }
/* 163 */     if (this.i.containsValue(paramClass)) {
/* 164 */       str = "Clientbound packet " + paramClass + " is already assigned to ID " + this.i.inverse().get(paramClass) + "; cannot re-assign to " + paramInt;
/* 165 */       LogManager.getLogger().fatal(str);
/* 166 */       throw new IllegalArgumentException(str);
/*     */     }
/* 168 */     this.i.put(Integer.valueOf(paramInt), paramClass);
/* 169 */     return this;
/*     */   }
/*     */   
/*     */   public BiMap a() {
/* 173 */     return this.h;
/*     */   }
/*     */   
/*     */   public BiMap b() {
/* 177 */     return this.i;
/*     */   }
/*     */   
/*     */   public BiMap a(boolean paramBoolean) {
/* 181 */     return paramBoolean ? b() : a();
/*     */   }
/*     */   
/*     */   public BiMap b(boolean paramBoolean) {
/* 185 */     return paramBoolean ? a() : b();
/*     */   }
/*     */   
/*     */   public int c() {
/* 189 */     return this.g;
/*     */   }
/*     */   
/*     */   static
/*     */   {
/* 132 */     e = new TIntObjectHashMap();
/* 133 */     f = Maps.newHashMap();
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
/*     */ 
/*     */     eo localeo;
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
/*     */ 
/* 193 */     for (localeo : values()) {
/* 194 */       e.put(localeo.c(), localeo);
/*     */       
/* 196 */       for (Class localClass : Iterables.concat(localeo.b().values(), localeo.a().values())) {
/* 197 */         if ((f.containsKey(localClass)) && (f.get(localClass) != localeo)) {
/* 198 */           throw new Error("Packet " + localClass + " is already assigned to protocol " + f.get(localClass) + " - can't reassign to " + localeo);
/*     */         }
/*     */         
/* 201 */         f.put(localClass, localeo);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static eo a(int paramInt) {
/* 207 */     return (eo)e.get(paramInt);
/*     */   }
/*     */   
/*     */   public static eo a(ft paramft) {
/* 211 */     return (eo)f.get(paramft.getClass());
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */