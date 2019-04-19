/*
 * Copyright (C) 2014 Andrew Comminos
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.morlunk.jumble.protocol;

import com.morlunk.jumble.protobuf.Mumble;

public interface JumbleTCPMessageListener {
    void messageAuthenticate(Mumble.Authenticate msg);

    void messageBanList(Mumble.BanList msg);

    void messageReject(Mumble.Reject msg);

    void messageServerSync(Mumble.ServerSync msg);

    void messageServerConfig(Mumble.ServerConfig msg);

    void messagePermissionDenied(Mumble.PermissionDenied msg);

    void messageUDPTunnel(Mumble.UDPTunnel msg);

    void messageUserState(Mumble.UserState msg);

    void messageUserRemove(Mumble.UserRemove msg);

    void messageChannelState(Mumble.ChannelState msg);

    void messageChannelRemove(Mumble.ChannelRemove msg);

    void messageTextMessage(Mumble.TextMessage msg);

    void messageACL(Mumble.ACL msg);

    void messageQueryUsers(Mumble.QueryUsers msg);

    void messagePing(Mumble.Ping msg);

    void messageCryptSetup(Mumble.CryptSetup msg);

    void messageContextAction(Mumble.ContextAction msg);

    void messageContextActionModify(Mumble.ContextActionModify msg);

    void messageRemoveContextAction(Mumble.ContextActionModify msg);

    void messageVersion(Mumble.Version msg);

    void messageUserList(Mumble.UserList msg);

    void messagePermissionQuery(Mumble.PermissionQuery msg);

    void messageCodecVersion(Mumble.CodecVersion msg);

    void messageUserStats(Mumble.UserStats msg);

    void messageRequestBlob(Mumble.RequestBlob msg);

    void messageSuggestConfig(Mumble.SuggestConfig msg);

    void messageVoiceTarget(Mumble.VoiceTarget msg);

    /**
     * Reads incoming protobuf TCP messages and performs the necessary action(s).
     * Designed to be subclassed at any level of the library, the default implementations do nothing.
     */
    class Stub implements JumbleTCPMessageListener {

        public void messageAuthenticate(Mumble.Authenticate msg) {
        }

        public void messageBanList(Mumble.BanList msg) {
        }

        public void messageReject(Mumble.Reject msg) {
        }

        public void messageServerSync(Mumble.ServerSync msg) {
        }

        public void messageServerConfig(Mumble.ServerConfig msg) {
        }

        public void messagePermissionDenied(Mumble.PermissionDenied msg) {
        }

        public void messageUDPTunnel(Mumble.UDPTunnel msg) {
        }

        public void messageUserState(Mumble.UserState msg) {
        }

        public void messageUserRemove(Mumble.UserRemove msg) {
        }

        public void messageChannelState(Mumble.ChannelState msg) {
        }

        public void messageChannelRemove(Mumble.ChannelRemove msg) {
        }

        public void messageTextMessage(Mumble.TextMessage msg) {
        }

        public void messageACL(Mumble.ACL msg) {
        }

        public void messageQueryUsers(Mumble.QueryUsers msg) {
        }

        public void messagePing(Mumble.Ping msg) {
        }

        public void messageCryptSetup(Mumble.CryptSetup msg) {
        }

        public void messageContextAction(Mumble.ContextAction msg) {
        }

        public void messageContextActionModify(Mumble.ContextActionModify msg) {
        }

        public void messageRemoveContextAction(Mumble.ContextActionModify msg) {
        }

        public void messageVersion(Mumble.Version msg) {
        }

        public void messageUserList(Mumble.UserList msg) {
        }

        public void messagePermissionQuery(Mumble.PermissionQuery msg) {
        }

        public void messageCodecVersion(Mumble.CodecVersion msg) {
        }

        public void messageUserStats(Mumble.UserStats msg) {
        }

        public void messageRequestBlob(Mumble.RequestBlob msg) {
        }

        public void messageSuggestConfig(Mumble.SuggestConfig msg) {
        }

        public void messageVoiceTarget(Mumble.VoiceTarget msg) {
        }
    }
}