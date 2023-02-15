// Copyright 2022-2023 Buf Technologies, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/status.proto

package build.buf.google.rpc;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.Status)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>int32 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .google.protobuf.Any details = 3 [json_name = "details"];</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getDetailsList();
  /**
   * <code>repeated .google.protobuf.Any details = 3 [json_name = "details"];</code>
   */
  com.google.protobuf.Any getDetails(int index);
  /**
   * <code>repeated .google.protobuf.Any details = 3 [json_name = "details"];</code>
   */
  int getDetailsCount();
}
